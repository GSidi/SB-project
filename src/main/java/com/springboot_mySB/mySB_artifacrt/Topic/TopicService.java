package com.springboot_mySB.mySB_artifacrt.Topic;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {

    List<Topics> topics = Arrays.asList(
            new Topics("spring", "Spring Framework", "Spring Framework description"),
                new Topics("java", "Java Framework", "Java Framework description"),
                new Topics("c++", "C++ Framework", "C++ Framework description")
        );

    public List<Topics> getAllTopics() {
        return topics;
    }
}
