package edu.gianluca.springblog.utils;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import edu.gianluca.springblog.model.Author;
import edu.gianluca.springblog.model.Post;
import edu.gianluca.springblog.repository.AuthorRepository;
import edu.gianluca.springblog.repository.PostRepository;

@Component
public class SampleData {

    @Autowired
    PostRepository postRepository;

    @Autowired
    AuthorRepository authorRepository;

    @PostConstruct
    public void savePosts() {
        List<Post> sample = new ArrayList<Post>();

        Author a1 = new Author();
        a1.setFirst_name("Gian");
        a1.setLast_name("Luca");
        a1.setDescription("I've heard you got a secret.");
        a1.setEmail("aaaaa@aaaaaa.com");
        a1.setSecret("aeeeeeeeeeeeeeeeeeeeeeeee");
        authorRepository.save(a1);

        Author a2 = new Author();
        a2.setFirst_name("Oliver");
        a2.setLast_name("Queen");
        a2.setDescription("Can you keep a secret?");
        a2.setEmail("queen_green@nationalcity.com");
        a2.setSecret("aaaaaaaaaaaaaaaaaaaaaaaaaae");
        authorRepository.save(a2);

        Post p1 = new Post();
        Post p2 = new Post();
        Post p3 = new Post();

        p1.setAuthor(a1);
        p1.setTitle("Hello World!");
        p1.setContent("Hi! This is my first post. Hope you all stay along with me");
        p1.setPublish_date(LocalDate.now());

        p2.setAuthor(a2);
        p2.setTitle("Let's get to business!");
        p2.setContent(
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Fusce volutpat ornare fringilla. Curabitur quis vestibulum lectus. Sed ornare condimentum ipsum, at cursus magna pellentesque a.");
        p2.setPublish_date(LocalDate.now());

        p3.setAuthor(a2);
        p3.setTitle("Up we go!");
        p3.setContent(
                "Quisque eget venenatis ipsum. Mauris tincidunt elit id accumsan commodo. Sed sed pellentesque libero.");
        p3.setPublish_date(LocalDate.now());

        sample.add(p1);
        sample.add(p2);
        sample.add(p3);

        for (Post p : sample) {
            postRepository.save(p);
        }

    }

}
