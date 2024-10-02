package com.book.controller;


import com.book.model.Book;
import com.book.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    BookService service;

    @GetMapping(value = "/books")
    public List<Book> getBooks(){
        return service.getAllBooks();
    }

    @PostMapping(value = "/book")
    public Book addBook(@RequestBody Book book){
        return service.addBookToDB(book);
    }

    @PostMapping("/find/title/{title}")
    public Book findByTitle(@RequestParam String title){
        return service.findByTitle(title);
    }

    // delete a book
    @ResponseStatus(HttpStatus.NO_CONTENT) // 204
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        service.deleteBookById(id);
    }
}