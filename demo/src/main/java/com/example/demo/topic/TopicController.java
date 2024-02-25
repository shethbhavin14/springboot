package com.example.demo.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
    
    @RequestMapping("/topics")
    public List<Topic> getAllTopics(){
        return Arrays.asList(
            new Topic("spring", "Spring Framework", "Spring Framework Desc."),
            new Topic("java", "Core Java", "Core Java Desc."),
            new Topic("javascript", "JavaScript", "JavaScript Desc.")
        );
    }
}
