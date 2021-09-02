package com.example.demoweb.service;

import com.example.demoweb.model.Post;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.Date;


@Service
public class PostService {
    private static final ArrayList<Post> posts = new ArrayList<>();
    public ArrayList<Post> listAllPosts(){
        return posts;
    }

    public static void create(String text) {
        posts.add(new Post(text, new Date()));
    }
}
