package com.accp.web.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Description:
 * @Author: liyong
 * @CreateDate: 2018/1/13 14:03
 * @Version: 1.0
 */
@ControllerAdvice
public class GlobalException {

    @ExceptionHandler(RuntimeException.class)
    @ResponseBody //异常结果以json格式返回客户端
    public String exceptionHandler(Exception e){
        e.printStackTrace();
        return "系统错误";
    }
}
