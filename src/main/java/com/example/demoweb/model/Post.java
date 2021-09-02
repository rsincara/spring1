package com.example.demoweb.model;

public class Post {
    private final String text;
    private Integer likes;
    public Post(String text){
        this.text = text;
    }

    public String text(){
        return text;
    }

    public Integer likes(){
        return likes;
    }
}
