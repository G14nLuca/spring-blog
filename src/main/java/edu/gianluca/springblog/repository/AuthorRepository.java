package edu.gianluca.springblog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.gianluca.springblog.model.Author;

public interface AuthorRepository extends JpaRepository<Author, Long> {

}
