package com.springboot_mySB.mySB_artifacrt.MyTests;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ClassController {
    @Autowired
    private ClassService classService;
    @RequestMapping("/classroom")
    public List<Classroom> getClassroom(){
        return classService.getAllClassrooms();
    }
}
