package com.josi.Controller;

import com.josi.model.Course;
import com.josi.service.CourseService;
import com.josi.Controller.CourseController;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/admin/courses")
@CrossOrigin
public class CourseController {
  @Autowired
  private CourseService courseService;

  @PostMapping("/add")
  public String add(@RequestBody Course course) {
    courseService.saveCourse(course);
    return "New course added";
  }

  @GetMapping("/getAll")
  public List<Course> list() {
    List<Course> courses = null;
    try {
      courses = courseService.getAllCourses();
      return courses;
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
    return courses;

  }
  @GetMapping("/get/{id}")
  public Course getCourse(@PathVariable int id){
    return courseService.getCourse(id);
  }
 

}