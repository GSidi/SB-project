package com.springboot_mySB.mySB_artifacrt.MyTests;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ClassController {
    @Autowired
    private ClassService classService;
    @RequestMapping("/classroom")
    public List<Classroom> getClassroom(){
        return classService.getAllClassrooms();
    }

    @RequestMapping("/classroom/{classId}")
    public Classroom getClass(@PathVariable String classId){
        return  classService.getClass(classId);
    }

    @PostMapping("/classroom")
    public void addClassroom(@RequestBody Classroom classroom){
        classService.addClassroom(classroom);
    }

//    @PutMapping("/classroom/")
//    public void addClassroom(@RequestBody Classroom classroom){
//        classService.addClassroom(classroom);
//    }
}
