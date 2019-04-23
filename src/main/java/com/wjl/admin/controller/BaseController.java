package com.wjl.admin.controller;

import com.wjl.admin.entity.BaseEntity;
import com.wjl.admin.enums.ResponseEnum;
import com.wjl.admin.service.BaseServiceI;
import com.wjl.admin.utils.ResultUtil;
import com.wjl.admin.vo.RespVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.List;

/**
 * BaseController.
 *
 * @param <T>实体类
 * @author 736662094
 */
@Slf4j
@RequestMapping("admin")
public class BaseController<T extends BaseEntity> {
    private BaseServiceI<T> service;

    @GetMapping("test")
    @ResponseBody
    public String test() {
        return "test";
    }

    public RespVo pageList(T entity) {
        return ResultUtil.success(service.pageList(entity));
    }

    public RespVo getOne(Integer id) {
        return ResultUtil.success(service.selectByPrimaryKey(id));
    }

    public RespVo addOne(T entity) {
        return ResultUtil.success(service.insert(Arrays.asList(entity)));
    }

    public RespVo add(List<T> list) {
        return ResultUtil.success(service.insert(list));
    }

    /**
     * 删除(逻辑删除).
     * @param entity 删除对象
     * @return RespVo
     */
    public RespVo del(T entity) {
        //设置删除状态
        entity.setIsDeleted(true);
        //非空检查
        if (entity.getId() == null) {
            return ResultUtil.error(ResponseEnum.FORM_DATA_ERR);
        }
        return ResultUtil.success(service.updateById(entity));
    }

    /**
     * 更新数据.
     * @param entity 更新对象
     * @return 更新结果
     */
    public RespVo edit(T entity) {
        //非空检查
        if (entity.getId() == null) {
            return ResultUtil.error(ResponseEnum.FORM_DATA_ERR);
        }
        return ResultUtil.success(service.updateById(entity));
    }
}
