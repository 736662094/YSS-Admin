package com.wjl.admin.entity;

import lombok.Data;

import javax.persistence.Id;

/**
 * 基类.
 * @author 736662094
 */
@Data
public class BaseEntity {
    @Id
    private Integer id;
    private Integer page = 1;
    private Integer size = 10;
    /**
     * 是否删除  0否 1是.
     */
    private Boolean isDeleted;
}
