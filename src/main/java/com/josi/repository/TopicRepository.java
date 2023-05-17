package com.josi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.josi.model.Topic;

public interface TopicRepository extends JpaRepository<Topic, Integer>
{
}
