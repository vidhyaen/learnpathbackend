package com.josi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.josi.model.Topic;
@Repository
public interface TopicRepository extends JpaRepository<Topic, Integer>
{
    
    Topic save(Topic topic);
}
