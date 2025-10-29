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

    public Book createBook(Book book){
        return bookRepository.save(book);
    }
    public List<Book> getAllBooks(){
        return bookRepository.findAll();
    }
    public Book getBookById(Long id){
        return bookRepository.findById(id).orElseThrow(()->new RuntimeException("No Book found with id:"+id));
    }
    public Book updateBook(Long id,Book book){

       Optional<Book> existingBook= bookRepository.findById(id);
       if(existingBook.isPresent()){
           existingBook.get().setId(existingBook.get().getId());
           existingBook.get().setAuthor(book.getAuthor());
           existingBook.get().setTitle(book.getTitle());
           existingBook.get().setPublication(book.getPublication());
           existingBook.get().setPublicationYear(book.getPublicationYear());
           existingBook.get().setAvailableCopies(book.getAvailableCopies());
       }
        return bookRepository.save(existingBook.get());
    }

}
