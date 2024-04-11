package org.example.model;

import java.time.LocalDate;

public class Press {
    private int id;
    private String title;
    private String content;
    private LocalDate publishDate;

    // Constructors, Getters, and Setters
    public Press() {}

    public Press(int id, String title, String content, LocalDate publishDate) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.publishDate = publishDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalDate getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(LocalDate publishDate) {
        this.publishDate = publishDate;
    }
}

