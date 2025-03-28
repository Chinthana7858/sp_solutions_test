package com.task.task2.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;
import java.util.Set;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class News {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String headline;

    private String description;

    public Set<Category> getCategories() {
        return categories;
    }

    public String getDescription() {
        return description;
    }

    public void setCategories(Set<Category> categories) {
        this.categories = categories;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setHeadline(String headline) {
        this.headline = headline;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getHeadline() {
        return headline;
    }

    public Long getId() {
        return id;
    }

    @ManyToMany
    @JoinTable(
            name = "news_category",
            joinColumns = @JoinColumn(name = "news_id"),
            inverseJoinColumns = @JoinColumn(name = "category_id")
    )
    private Set<Category> categories;

    @OneToMany(mappedBy = "news")
    private List<Comment> comments;
}
