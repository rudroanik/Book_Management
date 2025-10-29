package com.example.demo.repository;

import com.example.demo.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface BookRepository extends JpaRepository<Book, Long> {

    List<Book> findByAuthor(String authorName);

    List<Book> findByPublication(String publication);

    @Query("SELECT b FROM Book b " +
            "WHERE b.title LIKE %:keyword% " +
            "OR b.author LIKE %:keyword% " +
            "OR b.availableCopies LIKE %:keyword% " +
            "OR b.publicationYear LIKE %:keyword% " +
            "OR b.publication LIKE %:keyword%")
    List<Book> findBookByGenre(@Param("keyword") String Keyword);

}
