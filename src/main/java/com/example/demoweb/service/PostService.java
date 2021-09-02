package com.example.demoweb.service;

import com.example.demoweb.model.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;


@Service
public class PostService {

    public ArrayList<Post> listAllPosts(){
        ArrayList<Post> posts = new ArrayList<>();
        posts.add(new Post("Lalala", 999));
        posts.add(new Post("Sanya", 999));
        posts.add(new Post("Random text", 999));

        return posts;
    }
}
