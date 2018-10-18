package com.hunt.service.impl;

import com.hunt.dao.SysLoginStatusMapper;
import com.hunt.model.entity.SysLoginStatus;
import com.hunt.service.SysLoginStatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;

/**
 * @Auther: whq
 * @Date: 2018/10/18 09:57
 * @Description:
 */
@Service
public class SysLoginStatusServiceImpl implements SysLoginStatusService {
    @Autowired
    private SysLoginStatusMapper sysLoginStatusMapper;

    @Override
    public SysLoginStatus selectSysLoginStatusByUserId(Integer userId, Integer platform) {
        return sysLoginStatusMapper.selectByUserIdAndPlatform(userId, platform);
    }

    @Override
    public void updateSysLoginStatusByUserId(SysLoginStatus sysLoginStatus) {
        sysLoginStatusMapper.update(sysLoginStatus);
    }

}
