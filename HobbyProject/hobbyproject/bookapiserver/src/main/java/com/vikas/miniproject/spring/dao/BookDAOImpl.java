package com.vikas.miniproject.spring.dao;

import com.vikas.miniproject.spring.model.Book;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BookDAOImpl implements BookDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public long save(Book book) {
        sessionFactory.getCurrentSession().save(book);
        return book.getId();
    }

    @Override
    public List<Book> list() {
        return sessionFactory.getCurrentSession().createQuery("from Book").list();
    }

    @Override
    public Book get(long id) {
        return sessionFactory.getCurrentSession().get(Book.class,id);
    }

    @Override
    public void update(long id, Book book) {
        Session session = sessionFactory.getCurrentSession();
        Book oldBook = session.byId(Book.class).load(id);
        oldBook.setAuthor(book.getAuthor());
        oldBook.setTitle(book.getTitle());
        session.flush(); // by default Hibernate will flush/sync the session with DB btu it's good to do in some circumstances.
    }

    @Override
    public void delete(long id) {
        Session session = sessionFactory.getCurrentSession();
        Book book = session.byId(Book.class).load(id);
        session.delete(book);
    }
}
