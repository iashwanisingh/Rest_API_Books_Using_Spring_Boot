package com.books.books.services;

import com.books.books.entity.Book;

import java.util.List;

public interface BookService {
    public List<Book> getBooks();
    public Book addBook(Book book);

    public Book getBook(int bookId);

    public Book updateBook(Book book);

    public void deleteBook(int bookId);
}
