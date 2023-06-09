package com.josi.Controller;
import com.josi.model.Topic;
import com.josi.service.TopicService;
import com.josi.Controller.TopicController;
import com.josi.RequestDTO.TopicRequest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("/admin/topic")
@CrossOrigin
public class TopicController {
    @Autowired
    private TopicService topicService;
    @PostMapping("/add")
    public String add(@RequestBody TopicRequest topic){
        topicService.saveTopic(topic);
        return"New Topic added";
    }
    @GetMapping("/getAll")
    public List<Topic> list(){
      return topicService.getAllTopics();

    }
    @GetMapping("/get/{id}")
    public List<Topic> getTopic(@PathVariable int id){
      return topicService.getTopic(id);
    }
}