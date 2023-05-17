package com.josi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.josi.model.Course;


@Repository

public interface CourseRepository extends JpaRepository<Course, Integer>
{

   Course save(Course course);
}