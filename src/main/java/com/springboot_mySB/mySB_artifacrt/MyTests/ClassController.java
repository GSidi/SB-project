package com.springboot_mySB.mySB_artifacrt.MyTests;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ClassController {

    @RequestMapping("/classroom")
    public String getClassroom(){
        return "Test";
    }
}
