package com.task.task2.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Comment {
    public void setId(Long id) {
        this.id = id;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public void setNews(News news) {
        this.news = news;
    }

    public Long getId() {
        return id;
    }

    public String getComment() {
        return comment;
    }

    public News getNews() {
        return news;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String comment;

    @ManyToOne
    @JoinColumn(name = "news_id")
    private News news;
}
