package com.task.task2.repository;

import com.task.task2.entity.News;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface NewsRepository extends JpaRepository<News, Long> {
    @Query("SELECT n FROM News n JOIN n.categories c WHERE c.id = :categoryId")
    List<News> findAllByCategoryId(@Param("categoryId") Long categoryId);
}
