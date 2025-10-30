package com.example.demo.repository;

import com.example.demo.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.List;

public interface BookRepository extends JpaRepository<Book, Long> {

    List<Book> findByAuthor(String authorName);

    List<Book> findByPublication(String publication);

    List<Book> findByGenre(String genre);

}
