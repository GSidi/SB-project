package com.springboot_mySB.mySB_artifacrt.MyTests;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ClassService {

    List<Classroom> classrooms = new ArrayList<Classroom>();
    Classroom mathClassroom = new Classroom(1,20, 15, true, "Introduction to mathematics");
    Classroom geographyClassroom = new Classroom(2,23, 25, false, "Introduction to geography");
    Classroom physicsClassroom = new Classroom(3, 44 ,30 ,false, "Introduction to physics");
    Classroom literatureClassroom = new Classroom(434, 5, 33, true, "Introduction to literature");

    public List<Classroom> getAllClassrooms() {

        classrooms.add(mathClassroom);
        classrooms.add(geographyClassroom);
        classrooms.add(physicsClassroom);
        classrooms.add(literatureClassroom);
        return classrooms;
    }

    public Classroom getClass (String classId){
        return classrooms.stream().filter(cl -> cl.equals(classId)).findFirst().get();
    }

}
