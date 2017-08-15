package com.soho.config;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author Zhongchongtao
 */
@Component
@RestControllerAdvice
public class GlobalExceptionHandler {

    @ResponseStatus()
    @ExceptionHandler(value = Exception.class)
    public String cacheException(Exception e){
        return "发生异常";
    }

}
