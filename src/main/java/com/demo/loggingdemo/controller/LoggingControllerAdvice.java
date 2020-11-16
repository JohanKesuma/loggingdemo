package com.demo.loggingdemo.controller;

import com.demo.loggingdemo.exception.CustomException;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class LoggingControllerAdvice {
    
    @ExceptionHandler(value = CustomException.class)
    public String handleCustomException(CustomException exception) {
        return "from controller advice";
    }
}
