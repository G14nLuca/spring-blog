package edu.gianluca.springblog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.gianluca.springblog.model.Post;

public interface PostRepository extends JpaRepository<Post, Long> {

}
