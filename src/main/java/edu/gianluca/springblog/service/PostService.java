package edu.gianluca.springblog.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.gianluca.springblog.model.Post;
import edu.gianluca.springblog.repository.PostRepository;

@Service
public class PostService implements PostServiceMethods {

    @Autowired
    PostRepository postRepository;

    @Override
    public List<Post> getAllPosts() {
        return postRepository.findAll();
    }

    @Override
    public Post getOnePost(long id) {
        return postRepository.getById(id);
    }

    @Override
    public Post publishPost(Post p) {
        return postRepository.save(p);
    }

    @Override
    public void deletePost(Post p) {
        postRepository.delete(p);
    }

}
