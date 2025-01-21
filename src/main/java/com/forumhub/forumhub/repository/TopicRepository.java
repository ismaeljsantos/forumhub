package com.forumhub.forumhub.repository;

import com.forumhub.forumhub.model.Topic;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TopicRepository extends JpaRepository<Topic, Long> {
}
