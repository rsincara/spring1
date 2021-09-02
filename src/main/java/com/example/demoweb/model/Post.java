package com.example.demoweb.model;

import java.util.Date;

public class Post {
    private final String text;
    private Integer likes = 0;
    private Date creationDate;
    public Post(String text, Date creationDate){
        this.text = text;
        this.creationDate = creationDate;
    }

    public String text(){
        return text;
    }

    public Integer likes(){
        return likes;
    }

    public Date creationDate(){
        return creationDate;
    }
}
