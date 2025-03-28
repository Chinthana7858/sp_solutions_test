package com.task.task2.controller;

import com.task.task2.entity.Category;
import com.task.task2.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/categories")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @PostMapping
    public Category create(@RequestBody Category category) {
        return categoryService.createCategory(category);
    }

    @GetMapping
    public List<Category> getAll() {
        return categoryService.getAllCategories();
    }

    @GetMapping("/{id}")
    public Category getById(@PathVariable Long id) {
        return categoryService.getCategoryById(id);
    }



}
