package com.books.books.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Book {
    @Id
    private int bookiId;
    private String bookName;
    private String bookDescription;
    private String auther;

    public int getBookiId() {
        return bookiId;
    }

    public void setBookiId(int bookiId) {
        this.bookiId = bookiId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookDescription() {
        return bookDescription;
    }

    public void setBookDescription(String bookDescription) {
        this.bookDescription = bookDescription;
    }

    public String getAuther() {
        return auther;
    }

    public void setAuther(String auther) {
        this.auther = auther;
    }

    public Book() {

    }

    public Book(int bookiId, String bookName, String bookDescription, String auther) {
        this.bookiId = bookiId;
        this.bookName = bookName;
        this.bookDescription = bookDescription;
        this.auther = auther;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookiId=" + bookiId +
                ", bookName='" + bookName + '\'' +
                ", bookDescription='" + bookDescription + '\'' +
                ", auther='" + auther + '\'' +
                '}';
    }
}
