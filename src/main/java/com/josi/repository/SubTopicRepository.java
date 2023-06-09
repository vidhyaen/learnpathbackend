package com.josi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.josi.model.SubTopic;
@Repository
public interface SubTopicRepository extends JpaRepository<SubTopic, Integer>
{
    
    SubTopic save(SubTopic subtopic);

    List<SubTopic> findByTopicId(int id);
}
