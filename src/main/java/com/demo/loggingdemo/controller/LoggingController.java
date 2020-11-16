package com.demo.loggingdemo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoggingController {

    private Logger log = LoggerFactory.getLogger(LoggingController.class);
    
    @GetMapping(value = "/home")
    public String home() {
        log.trace("Trace from home");
        log.info("Info from home");
        log.warn("Warn from home");
        log.error("Error from home");
        System.out.println("Thread name : " + Thread.currentThread().getName());
        return "Home";
    }
}
