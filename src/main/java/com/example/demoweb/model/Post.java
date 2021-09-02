package com.example.demoweb.model;

public class Post {
    private final String text;
    private Integer likes;
    public Post(String text, Integer likes){
        this.text = text;
        this.likes = likes;
    }

    public String text(){
        return text;
    }

    public Integer likes(){
        return likes;
    }
}
