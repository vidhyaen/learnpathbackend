package com.josi.Controller;

import com.josi.model.SubTopic;
import com.josi.service.SubTopicService;
import com.josi.Controller.SubTopicController;
import com.josi.RequestDTO.SubTopicRequest;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.josi.model.Topic;
import com.josi.repository.SubTopicRepository;

@RestController
@RequestMapping("/admin/subtopic")
@CrossOrigin
public class SubTopicController {
  @Autowired
  private SubTopicService subTopicService;

  @PostMapping("/add")
  @ResponseBody
  public String add(@RequestBody SubTopicRequest subTopic) {

    subTopicService.saveSubTopic(subTopic);
    return "New SubTopic added";
  }

  @GetMapping("/getAll")
  public List<SubTopic> list() {
    return subTopicService.getAllSubTopics();

  }

  @GetMapping("/get/{id}")
  public SubTopic getSubTopic(@PathVariable int id) {

    return subTopicService.getSubTopic(id);
  }

  @PutMapping("/update/{id}/done/{is_done}")
  public String updateSubTopic(@PathVariable int id, @PathVariable int is_done) {
    subTopicService.updateSubTopicDone(id, is_done);
    return "SubTopic updated";
  }
}
