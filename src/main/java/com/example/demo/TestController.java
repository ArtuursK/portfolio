package com.example.demo;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class TestController {

    @GetMapping(value = "/")
    public String getPage(){

        //logika

        //papildinat lapu ar info
        return "index";
    }

    @PostMapping(value = "forms/submit")
    public String submitForm(){
        //papildinat lapu ar info
        return "index";
    }

}