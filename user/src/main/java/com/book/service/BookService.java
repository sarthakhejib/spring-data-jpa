package com.book.service;

import com.book.model.Book;
import com.book.repository.BookRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    private static final Logger log = LoggerFactory.getLogger(BookService.class);
    @Autowired
    private BookRepository repository;


    public Book addBookToDB(Book book){
           return repository.save(book);
    }

    public List<Book> getAllBooks(){
        return repository.findAll();
    }

    public Book findByTitle(String title){
        return repository.findByTitle(title);

    }

    public void deleteBookById(Long id){
        repository.deleteById(id);
    }
}
