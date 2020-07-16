package com.algorithm.salme.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestWeb {

    @RequestMapping("stat")
    public String stat(){
        return "hello world!!!";
    }
}
