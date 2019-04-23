package com.wjl.admin.mapper;

import tk.mybatis.mapper.common.ConditionMapper;
import tk.mybatis.mapper.common.ExampleMapper;
import tk.mybatis.mapper.common.IdsMapper;
import tk.mybatis.mapper.common.MySqlMapper;
import tk.mybatis.mapper.common.base.insert.InsertMapper;
import tk.mybatis.mapper.common.base.insert.InsertSelectiveMapper;
import tk.mybatis.mapper.common.special.InsertListMapper;

/**
 * BaseServiceImpl.
 * @param <T>实体类
 * @author 736662094
 */

public interface BaseMapper<T> extends
        tk.mybatis.mapper.common.BaseMapper<T>,
        MySqlMapper<T>,
        IdsMapper<T>,
        ConditionMapper<T>,
        ExampleMapper<T>,
        InsertMapper<T>,
        InsertListMapper<T>,
        InsertSelectiveMapper<T> {
}
