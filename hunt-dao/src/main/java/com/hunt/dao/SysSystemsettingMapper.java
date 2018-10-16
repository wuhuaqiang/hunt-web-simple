package com.hunt.dao;

import com.hunt.model.entity.SysSystemsetting;

import java.util.List;

/**
 * <p>
 * Mapper 接口
 * </p>
 *
 * @author ${author}
 * @since 2018-10-15
 */
public interface SysSystemsettingMapper {
    //查询全部
    public List<SysSystemsetting> selectAll();
}
