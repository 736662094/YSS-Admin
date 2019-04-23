package com.wjl.admin.advice;

import com.wjl.admin.enums.ResponseEnum;
import com.wjl.admin.utils.ResultUtil;
import com.wjl.admin.vo.RespVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
@Slf4j
public class ExceptionHandleAdvice {

    @ExceptionHandler(Exception.class)
    public RespVo handleCmsApiCommonException(Exception ex, HttpServletRequest request) {
        log.error(ex.getMessage());
        return ResultUtil.error(ResponseEnum.ERROR);
    }
}
