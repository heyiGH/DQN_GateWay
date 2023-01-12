package com.heyi.client.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class configController {

    @RequestMapping("/health")
    public String health(){
        System.out.println("=");
        return "OK";
    }
}
