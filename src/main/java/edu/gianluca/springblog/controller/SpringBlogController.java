package edu.gianluca.springblog.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import edu.gianluca.springblog.model.Post;
import edu.gianluca.springblog.service.PostServiceMethods;

@RestController
public class SpringBlogController {

    @Autowired
    PostServiceMethods psm;

    @GetMapping(value = "/")
    public ModelAndView getAllPosts() {
        ModelAndView mav = new ModelAndView("main");
        List<Post> posts = psm.getAllPosts();
        mav.addObject("posts", posts);
        return mav;
    }

}
