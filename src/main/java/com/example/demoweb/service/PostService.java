package com.example.demoweb.service;

import com.example.demoweb.model.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;


@Service
public class PostService {
    public ArrayList<Post> listAllPosts(){
        ArrayList<Post> posts = new ArrayList<>();
        posts.add(new Post("OOO"));
        posts.add(new Post("Moya"));
        posts.add(new Post("Oborona!"));
        return posts;
    }
}
