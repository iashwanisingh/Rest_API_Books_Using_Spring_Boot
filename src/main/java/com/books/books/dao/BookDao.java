package com.books.books.dao;

import com.books.books.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookDao extends JpaRepository<Book,Integer> {
    public Book findById(int bookId);
}
