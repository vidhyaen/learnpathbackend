package com.josi.service;

import com.josi.RequestDTO.TopicRequest;
import com.josi.model.Topic;

import java.util.List;

public interface TopicService {
    public Topic saveTopic(TopicRequest topic);
    public List<Topic> getAllTopics();
    public List<Topic> getTopic(int id);

    
}
