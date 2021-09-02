package com.example.demoweb.service;

import com.example.demoweb.model.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;


@Service
public class PostService {
    public ArrayList<Post> listAllPosts(){
        ArrayList<Post> posts = new ArrayList<>();
        posts.add(new Post("OOO", new Date()));
        posts.add(new Post("Moya", new Date()));
        posts.add(new Post("Oborona!", new Date()));
        return posts;
    }
}
