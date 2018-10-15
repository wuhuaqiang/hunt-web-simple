package com.hunt.system.security.shiro;

import com.hunt.system.exception.PasswordErrorException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.ExcessiveAttemptsException;
import org.apache.shiro.authc.credential.HashedCredentialsMatcher;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;

import java.util.concurrent.TimeUnit;

/**
 * @Auther: whq
 * @Date: 2018/7/4 11:39
 * @Description: 验证器，增加了登录次数校验功能
 */
public class RetryLimitCredentialsMatcher extends HashedCredentialsMatcher {
    private static final Logger log = LoggerFactory.getLogger(RetryLimitCredentialsMatcher.class);
    @Autowired
    private RedisTemplate<String, String> redisTemplate;

    @Override
    public boolean doCredentialsMatch(AuthenticationToken token, AuthenticationInfo info) {
        String username = (String) token.getPrincipal();
        //访问一次，计数一次
        ValueOperations<String, String> opsForValue = redisTemplate.opsForValue();
        if (!"LOCK".equals(opsForValue.get("longinLock" + username))) {
            String longinCount = opsForValue.get("longinCount" + username);
            if (longinCount == null) {
                opsForValue.set("longinCount" + username, "1");
            } else {
                opsForValue.set("longinCount" + username, Integer.parseInt(longinCount) + 1 + "");
            }
            redisTemplate.expire("longinCount" + username, 24, TimeUnit.HOURS);
            //计数大于5时，设置用户被锁定一小时
            if (Integer.parseInt(opsForValue.get("longinCount" + username)) >= 10) {
                opsForValue.set("longinLock" + username, "LOCK");
                redisTemplate.expire("longinLock" + username, 20, TimeUnit.MINUTES);
            }
        }
        if ("LOCK".equals(opsForValue.get("longinLock" + username))) {
            throw new ExcessiveAttemptsException("由于用户名或密码输入错误次数大于10次，帐号已锁定！");
        }
        boolean matches = super.doCredentialsMatch(token, info);
        if (matches) {
            //清空登录计数
            opsForValue.set("longinCount" + username, "0");
        } else {
            throw new IllegalStateException("用户名或密码不正确，再失败" + (10 - Integer.parseInt(opsForValue.get("longinCount" + username))) + "次,将锁定帐号");
        }
        return matches;
    }
}

