package com.springboot_mySB.mySB_artifacrt;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingsController {

    @RequestMapping("/hello")
    public String greetMe(){
        return "Hello World";
    }
}
