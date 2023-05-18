package com.josi.Controller;
import com.josi.model.Topic;
import com.josi.service.CourseService;
import com.josi.service.TopicService;
import com.josi.Controller.TopicController;
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
    public String add(@RequestBody Topic topic){
        topicService.saveTopic(topic);
        return"New Topic added";
    }
    @GetMapping("/getAll")
    public List<Topic> list(){
      return topicService.getAllTopics();

    }
}