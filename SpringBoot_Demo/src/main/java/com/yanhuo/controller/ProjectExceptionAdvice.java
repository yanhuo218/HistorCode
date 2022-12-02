package com.yanhuo.controller;

import com.yanhuo.exception.BusinessException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ProjectExceptionAdvice {
    @ExceptionHandler(BusinessException.class)
    public Result deBusinessException(BusinessException ex){
        System.out.println("aaa");
        return new Result(ex.getCode(),null, ex.getMessage());
    }


    @ExceptionHandler(Exception.class)
    public Result deException(Exception ex){
        System.out.println("错误错误错误");
        return new Result(Code.SYSTEM_ERR,null,"查询出现错误");
    }
}
