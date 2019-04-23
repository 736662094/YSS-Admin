package com.wjl.admin.enums;

import lombok.Getter;

@Getter
public enum ResponseEnum {

    SUCCESS(200, "操作成功！"),
    USERNAME_PASSWORD_ERR(401, "用户名或密码不正确！"),
    OLD_PASSWORD_ERR(402, "旧密码错误！"),
    CONFIRM_PASSWORD_ERR(403, "两次输入的密码不一致！"),
    FORBIDDEN(404, "您没有权限访问！"),
    NOT_FOUND(405, "资源不存在！"),
    DEL_NONE(406, "更新数据为0！"),
    FORM_DATA_ERR(407, "参数传递错误！"),
    ERROR(500, "服务器内部错误！");
    private Integer code;
    private String message;

    ResponseEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
