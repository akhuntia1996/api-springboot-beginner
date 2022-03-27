package com.example.demo.contoller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/")
@Api(tags = "Intial Contoller")
@Validated
public class MyContoller {

    private static final Logger logger = LoggerFactory.getLogger(MyContoller.class);
    
    @GetMapping("/")
    @ApiOperation("1st Link")
    public String myInit(){
        logger.info("hello");
        logger.error("error");
        logger.debug("my debug");
        return "Hello Bhai !!!";
    }

}
