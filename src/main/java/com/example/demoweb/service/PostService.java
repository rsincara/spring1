package com.example.demoweb.service;

import com.example.demoweb.model.Post;
import org.springframework.stereotype.Service;
import java.util.Date;
import java.util.Objects;
import java.util.Optional;


@Service
public class PostService {
    private static final ArrayList<Post> posts = new ArrayList<>();

    public ArrayList<Post> listAllPosts() {
        return posts;
    }

    public int getPostsCount() {
        int size = 0;
        for (Post post: listAllPosts()) {
            size++;
        }
        return size;
    }

    public static void create(String text) {
        posts.add(new Post((long) posts.size(), text, new Date()));
    }

    public void addPost(Post post) {
        postRepository.save(post);
    }

    public void remove(Long id) {
        Optional<Post> post = postRepository.findById(id);
        post.ifPresent(value -> postRepository.delete(value));
    }
}
