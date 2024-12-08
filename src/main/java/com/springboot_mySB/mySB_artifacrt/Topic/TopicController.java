package com.springboot_mySB.mySB_artifacrt.Topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.http.HttpResponse;
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

    @PostMapping("/topics")
    public void addTopic(@RequestBody Topics topic){
        topicService.addTopic(topic);
    }
}
