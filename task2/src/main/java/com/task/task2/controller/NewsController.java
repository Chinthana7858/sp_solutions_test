package com.task.task2.controller;

import com.task.task2.entity.News;
import com.task.task2.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/news")
public class NewsController {

    @Autowired
    private NewsService newsService;

    @PostMapping
    public News createNews(@RequestBody News news) {
        return newsService.createNews(news);
    }

    @GetMapping
    public List<News> getAllNews() {
        return newsService.getAllNews();
    }

    @GetMapping("/{id}")
    public News getNewsById(@PathVariable Long id) {
        return newsService.getNewsById(id);
    }
    @GetMapping("/category/{categoryId}")
    public List<News> getNewsByCategory(@PathVariable Long categoryId) {
        return newsService.getNewsByCategoryId(categoryId);
    }


}
