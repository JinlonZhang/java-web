package org.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by qsym on 2017/1/20.
 */



@Controller
public class Demo01 {

    @RequestMapping(value = "/hello")
    public String helloWorld(){

        return "hello";
    }



}
