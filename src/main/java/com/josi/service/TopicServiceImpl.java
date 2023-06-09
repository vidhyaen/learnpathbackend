package com.josi.service;
import com.josi.RequestDTO.TopicRequest;
import com.josi.model.Course;
import com.josi.model.SubTopic;
import com.josi.model.Topic;
import com.josi.repository.TopicRepository;
import com.josi.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class TopicServiceImpl implements TopicService {
    @Autowired
    private TopicRepository topicRepository;

    @Autowired
    private SubTopicService subTopicService;

    @Override
    public Topic saveTopic(TopicRequest topic) {
        Topic newTopic = Topic.builder().build();
        newTopic.setTopic_name(topic.getTopic_name());
        Course course = Course.builder()
                .id(topic.getCourse_id())
                .build();
        newTopic.setCourse(course);
        return topicRepository.save(newTopic);
    }

    @Override
    public List<Topic> getAllTopics() {
        return topicRepository.findAll();
    }
    @Override
    public List<Topic> getTopic(int id) {
        List<Topic> topics = topicRepository.findByCourseId(id);
        topics.forEach(topic -> {
           List<SubTopic> subTopics = subTopicService.getByTopicId(topic.getId());
           topic.setSubTopics(subTopics);
        });
        return topics;
    }
}
