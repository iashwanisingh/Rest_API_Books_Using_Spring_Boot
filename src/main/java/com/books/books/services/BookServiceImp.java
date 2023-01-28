package com.books.books.services;

import com.books.books.dao.BookDao;
import com.books.books.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImp implements BookService {

    @Autowired
    private BookDao bookDao;

    @Override
    public List<Book> getBooks() {
        return bookDao.findAll();
    }

    @Override
    public Book addBook(Book book) {
        return bookDao.save(book);
    }

    @Override
    public Book getBook(int bookId) {
        return bookDao.findById(bookId);
    }

    @Override
    public Book updateBook(Book book) {
       return bookDao.save(book);
    }

    @Override
    public void deleteBook(int bookId) {
        Book book = bookDao.findById(bookId);
        bookDao.delete(book);
    }


}
