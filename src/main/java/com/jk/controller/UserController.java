package com.jk.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;


@Controller
public class UserController {


    @RequestMapping("/hello")
    public  String hello(){
        System.out.println("你好呀");
        return " hello word";

    }


    @RequestMapping("/hi")
    public  String hi(){
        return  "hi lalala , how are you wangchao?";
    }

}