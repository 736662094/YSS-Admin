package com.wjl.admin.service;

import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * BaseServiceI.
 *
 * @param <T> 实体
 * @author 736662094
 */
public interface BaseServiceI<T> {
    /**
     * 获取分页列表.
     *
     * @param entity 查询条件
     * @return 分页数据
     */
    PageInfo<T> pageList(T entity);

    /**
     * 根据条件查询一条数据.
     *
     * @param entity 查询条件
     * @return 实体
     */
    T selectOne(T entity);

    /**
     * 根据主键查询一条数据.
     *
     * @param id 主键
     * @return 实体
     */
    T selectByPrimaryKey(Integer id);

    /**
     * 添加实体(支持批量添加).
     *
     * @param list 添加对象列表
     * @return 成功条数
     */
    int insert(List<T> list);

    /**
     * 更新实体.
     *
     * @param entity 更新对象列表
     * @return 成功条数
     */
    int updateById(T entity);
}
