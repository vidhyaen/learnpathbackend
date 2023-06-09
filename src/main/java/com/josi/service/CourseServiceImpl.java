package com.josi.service;
import com.josi.model.Course;
import com.josi.model.Signup;
import com.josi.repository.SignupRepository;
import com.josi.repository.CourseRepository;
import com.josi.repository.TopicRepository;
import com.josi.service.CourseService;

import org.hibernate.annotations.FetchProfile.FetchOverride;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class CourseServiceImpl implements CourseService {

    @Autowired
    private CourseRepository courseRepository;

    @Override
    public Course saveCourse(Course course) {
        return courseRepository.save(course);
    }

    @Override
    public List<Course> getAllCourses() {
        return courseRepository.findAll();
    }

    @Override
    public Course getCourse(int id) {
        return courseRepository.findById(id).get();
      

    }

}
