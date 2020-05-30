package com.vikas.miniproject.spring.service;

import com.vikas.miniproject.spring.dao.BookDAO;
import com.vikas.miniproject.spring.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional // Read https://www.baeldung.com/spring-vs-jta-transactional and https://www.baeldung.com/transaction-configuration-with-jpa-and-spring
public class BookServiceImpl implements BookService{
    @Autowired
    private BookDAO bookDAO;

    @Override
    public long save(Book book) {
        return bookDAO.save(book);
    }

    @Override
    public List<Book> list() {
        return bookDAO.list();
    }

    @Override
    public Book get(long id) {
        return bookDAO.get(id);
    }

    @Override
    public void update(long id, Book book) {
        bookDAO.update(id,book);
    }

    @Override
    public void delete(long id) {
        bookDAO.delete(id);
    }
}
