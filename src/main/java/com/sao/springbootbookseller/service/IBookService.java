package com.sao.springbootbookseller.service;/*
 * @created 26/12/2022 - 11:24
 * @project spring-boot-book-seller
 * @author Azzouz
 */

import com.sao.springbootbookseller.model.Book;

import java.util.List;

public interface IBookService {
    Book saveBook(Book book);

    void deleteBook(Long id);

    List<Book> findAllBooks();
}
