package com.task.task2.service;

import com.task.task2.entity.Comment;
import com.task.task2.entity.News;
import com.task.task2.repository.CategoryRepository;
import com.task.task2.repository.CommentRepository;
import com.task.task2.repository.NewsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentService {
    @Autowired
    private CommentRepository commentRepository;
    @Autowired
    private NewsRepository newsRepository;

    public Comment addComment(Long newsId, Comment comment) {
        News news = newsRepository.findById(newsId).orElse(null);
        if (news == null) return null;

        comment.setNews(news);
        return commentRepository.save(comment);
    }

    public List<Comment> getCommentsByNewsId(Long newsId) {
        return commentRepository.findByNewsId(newsId);
    }
}
