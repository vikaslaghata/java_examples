package com.vikas.miniproject.spring.service;

import com.vikas.miniproject.spring.model.Book;

import java.util.List;

public interface BookService {
    long save(Book book);
    List<Book> list();
    Book get(long id);
    void update(long id, Book book);
    void delete(long id);
}
