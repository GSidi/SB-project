package com.springboot_mySB.mySB_artifacrt.MyTests;

import com.springboot_mySB.mySB_artifacrt.Topic.Topics;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ClassService {

    List<Classroom> classrooms = new ArrayList<Classroom>();
    Classroom mathClassroom = new Classroom(20, 15, true, "Introduction to mathematics");
    Classroom geographyClassroom = new Classroom(23, 25, false, "Introduction to geography");
    Classroom physicsClassroom = new Classroom(17, 44, false, "Introduction to physics");
    Classroom literatureClassroom = new Classroom(34, 5, true, "Introduction to literature");

    public List<Classroom> getAllClassrooms() {

        classrooms.add(mathClassroom);
        classrooms.add(geographyClassroom);
        classrooms.add(physicsClassroom);
        classrooms.add(literatureClassroom);
        return classrooms;
    }

}
