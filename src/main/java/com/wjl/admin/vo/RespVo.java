package com.wjl.admin.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RespVo<T> {
    private Integer code;
    private String msg;
    private T data;
    private Long count;


    public RespVo(Integer errCode, String errMsg) {
        this.code = errCode;
        this.msg = errMsg;
    }

    public RespVo(Integer code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }
}
