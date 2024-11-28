package com.springboot_mySB.mySB_artifacrt.Topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class TopicController {

    @Autowired
    private  TopicService topicService;

    @RequestMapping("/topics")
    public List<Topics> getAllTopics() {
        return topicService.getAllTopics();
    }

    @RequestMapping("/topics/{topicId}")
    public Topics getTopic(@PathVariable String topicId){
        return  topicService.getTopic(topicId);
    }
}
