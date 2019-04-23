package com.wjl.admin.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wjl.admin.entity.BaseEntity;
import com.wjl.admin.mapper.BaseMapper;
import com.wjl.admin.service.BaseServiceI;
import lombok.Data;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * BaseServiceImpl.
 * @param <T> 实体类
 * @author 736662094
 */
@Data
public class BaseServiceImpl<T extends BaseEntity> implements BaseServiceI<T> {
    protected BaseMapper<T> mapper;

    @Override
    public PageInfo<T> pageList(T entity) {
        PageHelper.startPage(entity.getPage(), entity.getSize());
        List<T> list = mapper.selectByCondition(entity);
        PageInfo<T> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }

    @Override
    public T selectOne(T entity) {
        return mapper.selectOne(entity);
    }

    @Override
    public T selectByPrimaryKey(Integer id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    @Transactional
    public int insert(List<T> list) {
        return mapper.insertList(list);
    }

    @Override
    @Transactional
    public int updateById(T entity) {
        return mapper.updateByPrimaryKey(entity);
    }
}
