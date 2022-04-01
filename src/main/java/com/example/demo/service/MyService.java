package com.example.demo.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class MyService {

    private static final Logger logger = LoggerFactory.getLogger(MyService.class);
    
    public void myServiceMethod(String name){
        // for(int i=0;i<10;i++){
        //     logger.info("Logging for " + name + " : " + i+1);
        // }

        try{
        Thread.sleep(5000);
        }catch(Exception e){}
    }
}
