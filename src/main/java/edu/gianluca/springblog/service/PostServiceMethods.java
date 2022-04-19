package edu.gianluca.springblog.service;

import java.util.List;

import edu.gianluca.springblog.model.Post;

public interface PostServiceMethods {

    List<Post> getAllPosts();

    Post getOnePost(long id);

    Post publishPost(Post p);

    void deletePost(Post p);

}
