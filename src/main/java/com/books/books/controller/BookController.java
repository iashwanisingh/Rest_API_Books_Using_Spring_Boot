package com.books.books.controller;

import com.books.books.dao.BookDao;
import com.books.books.entity.Book;
import com.books.books.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class BookController {

    @Autowired
    private BookService bookService;

    private Book book;
    private final BookDao bookDao;

    public BookController(BookDao bookDao) {

        this.bookDao = bookDao;
    }

    @GetMapping("/books")
    public ResponseEntity<List<Book>> getBooks() {
        List<Book> book = this.bookService.getBooks();
        if (book.isEmpty()) {
            return ResponseEntity.status(HttpStatusCode.valueOf(404)).build();
        }
        return ResponseEntity.of(Optional.of(book));
    }

    @PostMapping("/books")
    public ResponseEntity<Book> addBook(@RequestBody Book book) {
        return ResponseEntity.of(Optional.of(this.bookService.addBook(book)));
    }

    //Get by bookId
    @GetMapping("/books/{bookId}")
    public ResponseEntity<Book> getBook(@PathVariable("bookId") int bookId) {
        try {
            return ResponseEntity.of(Optional.of(this.bookService.getBook(bookId)));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    }

    //update books by id
    @PutMapping("/books/{bookId}")
    public ResponseEntity<Book> updateBook(@RequestBody Book book) {
        try {
            return ResponseEntity.of(Optional.of(this.bookService.updateBook(book)));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
    }

    @DeleteMapping("/books/{bookId}")
    public ResponseEntity<HttpStatus> deleteBook(@PathVariable("bookId") int bookId) {
        try {
            this.bookService.deleteBook(bookId);
            System.out.println(ResponseEntity.ok("Book with BookId " + bookId + " successfully removed from database."));
            return ResponseEntity.status(HttpStatusCode.valueOf(200)).build();
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

}
