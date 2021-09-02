package com.example.demoweb.model;

import java.util.Date;

public class Post {
    private Long id;
    private final String text;
    private Integer likes = 0;
    private Date creationDate;

    public Post(Long id, String text, Date creationDate) {
        this.id = id;
        this.text = text;
        this.creationDate = creationDate;
    }

    public Long id (){
        return this.id;
    }

    public String text() {
        return text;
    }

    public Integer getLikes() {
        return likes;
    }

    public Date creationDate() {
        return creationDate;
    }

    public void setLikes(Integer value) {
        this.likes = value;
    }
}
