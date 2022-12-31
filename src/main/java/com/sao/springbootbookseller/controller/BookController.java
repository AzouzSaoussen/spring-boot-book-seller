package com.sao.springbootbookseller.controller;/*
 * @created 29/12/2022 - 12:32 PM
 * @project spring-boot-book-seller
 * @author Azzouz
 */

import com.sao.springbootbookseller.model.Book;
import com.sao.springbootbookseller.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/book")//pre-path
public class BookController {
    @Autowired
    private IBookService bookService;

    @PostMapping //api/book
    public ResponseEntity<?> saveBook(@RequestBody Book book)
    {
        return new ResponseEntity<>(bookService.saveBook(book), HttpStatus.CREATED);
    }

    @DeleteMapping("{bookId}") //api/book/{bookId}
    public ResponseEntity<?> deleteBook(@PathVariable Long bookId)
    {
        bookService.deleteBook(bookId);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping //api/book
    public ResponseEntity<?> getAllBooks()
    {
        return new ResponseEntity<>(bookService.findAllBooks(), HttpStatus.OK);
    }


}
