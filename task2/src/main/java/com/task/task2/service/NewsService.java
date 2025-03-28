package com.task.task2.service;

import com.task.task2.entity.Category;
import com.task.task2.entity.News;
import com.task.task2.repository.CategoryRepository;
import com.task.task2.repository.NewsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class NewsService {

    @Autowired
    private NewsRepository newsRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    public List<News> getAllNews() {
        return newsRepository.findAll();
    }

    public News getNewsById(Long id) {
        return newsRepository.findById(id).orElse(null);
    }

    public List<News> getNewsByCategoryId(Long categoryId) {
        return newsRepository.findAllByCategoryId(categoryId);
    }



    public News createNews(News news) {
        Set<Category> attachedCategories = new HashSet<>();
        for (Category c : news.getCategories()) {
            Category category = categoryRepository.findById(c.getId()).orElse(null);
            if (category != null) {
                attachedCategories.add(category);
            }
        }
        news.setCategories(attachedCategories);
        return newsRepository.save(news);
    }

}
