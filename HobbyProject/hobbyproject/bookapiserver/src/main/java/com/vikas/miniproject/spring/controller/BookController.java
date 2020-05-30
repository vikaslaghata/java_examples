package com.vikas.miniproject.spring.controller;

import com.vikas.miniproject.spring.model.Book;
import com.vikas.miniproject.spring.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {
    @Autowired
    private BookService bookService;

    @GetMapping("api/book")
    public ResponseEntity<List<Book>> list() {
        List<Book> list = bookService.list();
        return ResponseEntity.ok().body(list);
    }

    @PostMapping("api/book")
    public ResponseEntity<?> save(@RequestBody Book book) {
        long id = bookService.save(book);
        return ResponseEntity.ok().body("Book created with id: "+id);
    }

    @GetMapping("api/book/{id}")
    public ResponseEntity<Book> get(@PathVariable("id") long id) {
        Book book = bookService.get(id);
        return ResponseEntity.ok().body(book);
    }

    @PutMapping("api/book/{id}")
    public ResponseEntity<?> update(@PathVariable("id")long id, @RequestBody Book book) {
        bookService.update(id, book);
        return ResponseEntity.ok().body("Book has been updated");
    }

    @DeleteMapping("api/book/{id}")
    public ResponseEntity<?> delete(@PathVariable("id")long id){
        bookService.delete(id);
        return ResponseEntity.ok().body("book has been deleted");
    }
}
