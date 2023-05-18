// package com.josi.Controller;
// import com.josi.model.SubTopic;
// import com.josi.service.SubTopicService;
// import com.josi.Controller.SubTopicController;
// import java.util.List;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.web.bind.annotation.*;
// import com.josi.model.Topic;


// @RestController
// @RequestMapping("/admin/subtopic")
// @CrossOrigin
// public class SubTopicController {
//     @Autowired
//     private SubTopicService subTopicService;
//     @PostMapping("/add")
//     public String add(@RequestBody SubTopic subTopic){
//         subTopicService.saveSubTopic(subTopic);
//         return"New SubTopic added";
//     }
//     @GetMapping("/getAll")
//     public List<SubTopic> list(){
//       return subTopicService.getAllSubTopics();

//     }
// }