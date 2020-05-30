package com.vikas.miniproject.spring.dao;

import com.vikas.miniproject.spring.model.Book;

import java.util.List;

public interface BookDAO {
    long save(Book book);
    List<Book> list();
    Book get(long id);
    void update(long id, Book book);
    void delete(long id);
}
