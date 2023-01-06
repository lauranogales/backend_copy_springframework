package com.example.demoo.com.Webapp.Controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonServletController {
    @RequestMapping("/person")
    public String helloMsg(){
        String msg = "Hello person!";
        return msg;
    }
}
