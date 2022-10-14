package com.demo.bootservice.reposiotry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.bootservice.model.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer>{

}
