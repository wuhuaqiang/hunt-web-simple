package com.hunt.service.impl;

import com.hunt.dao.SysSystemsettingMapper;
import com.hunt.model.entity.SysSystemsetting;
import com.hunt.service.SysSystemsettingService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Auther: whq
 * @Date: 2018/10/16 11:44
 * @Description:
 */
@Service
@Transactional
public class SysSystemsettingServiceImpl implements SysSystemsettingService {
    private static final Logger log = LoggerFactory.getLogger(SysSystemsettingServiceImpl.class);
    @Autowired
    private SysSystemsettingMapper sysSystemsettingMapper;

    @Override
    public List<SysSystemsetting> selectAll() {
        return sysSystemsettingMapper.selectAll();
    }
}
