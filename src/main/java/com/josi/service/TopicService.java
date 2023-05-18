package com.josi.service;

import com.josi.model.Topic;

import java.util.List;

public interface TopicService {
    public Topic saveTopic(Topic topic);
    public List<Topic> getAllTopics();

    
}
