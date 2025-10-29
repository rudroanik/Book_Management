package com.example.demo.service;

import com.example.demo.entity.Book;
import com.example.demo.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class BookService {

    private final BookRepository bookRepository;

    public Book createBook(Book book) {
        return bookRepository.save(book);
    }

    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    public Book getBookById(Long id) {
        return bookRepository.findById(id).orElseThrow(() -> new RuntimeException("No Book found with id:" + id));
    }

    public Book updateBook(Long id, Book book) {

        Book existingBook = bookRepository.findById(id).orElseThrow(() -> new RuntimeException("No Book found with id:" + id));

        existingBook.setId(existingBook.getId());
        existingBook.setTitle(book.getTitle());
        existingBook.setAuthor(book.getAuthor());
        existingBook.setPublication(book.getPublication());
        existingBook.setPublicationYear(book.getPublicationYear());
        existingBook.setAvailableCopies(book.getAvailableCopies());

        return bookRepository.save(existingBook);
    }
    public void deleteBookById(Long id) {
        bookRepository.deleteById(id);
    }
    public List<Book> findBooksByAuthorName(String authorName) {
        return bookRepository.findByAuthor(authorName);
    }

    public List<Book> findBooksByPublication(String publication) {
        return bookRepository.findByPublication(publication);
    }
    public List<Book> findBookByGenre(String genre) {
        return bookRepository.findBookByGenre(genre);
    }

}
