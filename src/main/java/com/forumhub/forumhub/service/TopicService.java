package com.forumhub.forumhub.service;

import com.forumhub.forumhub.model.Topic;
import com.forumhub.forumhub.repository.TopicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class TopicService {

    @Autowired
    private TopicRepository topicRepository;

    public Topic createTopic(Topic topic){
        topic.setCreatedAt(LocalDateTime.now());
        return topicRepository.save(topic);
    }

    public List<Topic> getAllTopics(){
        return topicRepository.findAll();
    }

    public Optional<Topic> getTopicById(Long id){
        return topicRepository.findById(id);
    }

    public Topic updateTopic(Long id, Topic updatedTopic) {
        return topicRepository.findById(id)
                .map(topic -> {
                    topic.setTitle(updatedTopic.getTitle());
                    topic.setContent(updatedTopic.getContent());
                    return topicRepository.save(topic);
                }).orElse(null);
    }

    public void deleteTopic(Long id){
        topicRepository.deleteById(id);
    }
}
