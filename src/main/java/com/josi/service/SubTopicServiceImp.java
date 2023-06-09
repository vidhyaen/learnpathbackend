package com.josi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.josi.RequestDTO.SubTopicRequest;
import com.josi.model.Course;
import com.josi.model.SubTopic;
import com.josi.model.Topic;
import com.josi.service.SubTopicService;
import com.josi.repository.SubTopicRepository;

import java.util.List;

@Service
public class SubTopicServiceImp

        implements SubTopicService {
    @Autowired
    private SubTopicRepository subtopicRepository;

    @Override
    public SubTopic saveSubTopic(SubTopicRequest subtopic) {
        Topic topic = Topic.builder()
                .id(subtopic.getTopic_id())
                .build();
        Course course = Course.builder()
                .id(subtopic.getCourse_id())
                .build();

        SubTopic newSubTopic = SubTopic.builder().build();
        newSubTopic.setSub_topic_name(subtopic.getSub_topic_name());
        newSubTopic.setDescription(subtopic.getDescription());
        newSubTopic.setContent_url(subtopic.getContent_url());
        newSubTopic.setTopic(topic);
        newSubTopic.setCourse(course);

        return subtopicRepository.save(newSubTopic);
    }

    @Override
    public List<SubTopic> getAllSubTopics() {
        return subtopicRepository.findAll();
    }

    @Override
    public SubTopic getSubTopic(int id) {
        return subtopicRepository.findById(id).get();
    }

    @Override
    public List<SubTopic> getByTopicId(int id) {
        return subtopicRepository.findByTopicId(id);
    }

    @Override
    public void updateSubTopicDone(int id, int is_done) {
        SubTopic subtopic = subtopicRepository.findById(id).get();
        subtopic.setIs_done(is_done);
        subtopicRepository.save(subtopic);
    }
}
