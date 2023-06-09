package com.josi.service;

import java.util.List;

import com.josi.RequestDTO.SubTopicRequest;
import com.josi.model.SubTopic;
// import com.josi.Controller.SubTopicController;


public interface SubTopicService {
    public SubTopic saveSubTopic(SubTopicRequest subTopic);
    public List<SubTopic> getAllSubTopics();
    public SubTopic getSubTopic(int id);
    public List<SubTopic> getByTopicId(int id);
    // public void updateSubTopic(int id);
    public void updateSubTopicDone(int id, int is_done);
}
