package com.hunt.service;

import com.hunt.model.entity.SysLoginStatus;

import java.io.Serializable;

/**
 * @Auther: whq
 * @Date: 2018/10/18 09:54
 * @Description:
 */
public interface SysLoginStatusService {
    public SysLoginStatus selectSysLoginStatusByUserId(Integer userId, Integer platform);

    public void updateSysLoginStatusByUserId(SysLoginStatus sysLoginStatus);
}
