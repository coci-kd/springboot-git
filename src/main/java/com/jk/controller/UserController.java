package com.jk.controller;

import org.springframework.web.bind.annotation.RequestMapping;

public class UserController {


    @RequestMapping("/hello")
    public  String hello(){
        return " hello word";
    }

}
