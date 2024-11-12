package com.springboot_mySB.mySB_artifacrt;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class TopicController {

    @RequestMapping("/topics")
    public List<Topics> getAllTopics() {
        return Arrays.asList(
                new Topics("spring", "Spring Framework", "Spring Framework description"),
                new Topics("java", "Java Framework", "Java Framework description"),
                new Topics("c++", "C++ Framework", "C++ Framework description")
        );
    }
}
