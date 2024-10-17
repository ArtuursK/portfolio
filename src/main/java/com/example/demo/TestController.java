package com.example.demo;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TestController {

    @GetMapping(value = "/")
    public String getPage(){





        //logika

        //papildinat lapu ar info
        return "index";
    }

    @PostMapping(value = "/contactform/submit")
    public String submitForm(
            @RequestParam("email") String email,
            @RequestParam("message") String message
    ){
        System.out.println("email: " + email);
        System.out.println("message: " + message);
        //TODO janosuta dati uz savu epastu
        return "index";
    }

}
