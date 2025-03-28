package com.task.task2.controller;

import com.task.task2.entity.Comment;
import com.task.task2.service.CategoryService;
import com.task.task2.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/comments")
public class CommentController {

    @Autowired
    private CommentService commentService;
    @PostMapping("/news/{newsId}")
    public Comment addComment(@PathVariable Long newsId, @RequestBody Comment comment) {
        return commentService.addComment(newsId, comment);
    }
    @GetMapping("/news/{newsId}")
    public List<Comment> getCommentsByNewsId(@PathVariable Long newsId) {
        return commentService.getCommentsByNewsId(newsId);
    }

}
