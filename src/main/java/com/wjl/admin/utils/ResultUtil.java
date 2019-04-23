package com.wjl.admin.utils;


import com.wjl.admin.enums.ResponseEnum;
import com.wjl.admin.vo.RespVo;

/**
 * ResultUtil.
 *
 * @author 736662094
 */
public class ResultUtil {

    public static RespVo success() {
        return new RespVo(ResponseEnum.SUCCESS.getCode(), ResponseEnum.SUCCESS.getMessage());
    }

    /**
     * 构造成功返回对象.
     * @param object 返回数据
     * @return 对象
     */
    public static RespVo success(Object object) {
        return new RespVo(
                ResponseEnum.SUCCESS.getCode(),
                ResponseEnum.SUCCESS.getMessage(),
                object);
    }

    public static RespVo error(ResponseEnum error) {
        return new RespVo(error.getCode(), error.getMessage());
    }
}
