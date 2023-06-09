


package com.josi.service;

import com.josi.model.Course;

import java.util.List;

public interface CourseService {
    public Course saveCourse(Course course);
    public List<Course> getAllCourses();
    public Course getCourse(int id);
   

    
}
