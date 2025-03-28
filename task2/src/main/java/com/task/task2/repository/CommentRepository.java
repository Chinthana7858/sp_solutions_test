package com.task.task2.repository;

import com.task.task2.entity.Category;
import com.task.task2.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommentRepository extends JpaRepository<Comment, Long> {
    List<Comment> findByNewsId(Long newsId);
}
