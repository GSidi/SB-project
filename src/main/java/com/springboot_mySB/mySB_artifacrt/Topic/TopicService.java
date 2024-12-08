package com.springboot_mySB.mySB_artifacrt.Topic;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {

    List<Topics> topics = new ArrayList<>(Arrays.asList(
            new Topics("spring", "SpringFramework", "Spring Framework description"),
                new Topics("java", "JavaFramework", "Java Framework description"),
                new Topics("c++", "C++Framework", "C++ Framework description")
        ));

    public List<Topics> getAllTopics() {
        return topics;
    }


    public Topics getTopic(String topicId){
        return topics.stream().filter(t -> t.getId().equals(topicId)).findFirst().get();
    }

    public void addTopic(Topics topic){
        topics.add(topic);
    }

    public void updateTopic(Topics topic, String topicId){
        for (int i = 0; i < topics.size(); i++){
            Topics t = topics.get(i);
            if (t.getId().equals(topicId)){
                topics.set(i, topic);
                return;
            }
        }
    }

    public void deleteTopic(String topicId){
        topics.removeIf(t -> t.getId().equals(topicId));
    }
}
