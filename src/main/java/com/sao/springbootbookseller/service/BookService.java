package com.sao.springbootbookseller.service;/*
 * @created 26/12/2022 - 11:25
 * @project spring-boot-book-seller
 * @author Azouz
 */

import com.sao.springbootbookseller.model.Book;
import com.sao.springbootbookseller.repository.IBookRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
@Service

public class BookService implements IBookService{
    private final IBookRepository bookRepository;
    public BookService(IBookRepository bookRepository)
    {
        this.bookRepository = bookRepository;
    }
    @Override
    public Book saveBook(Book book) {
        book.setCreateTime(LocalDateTime.now());
        return bookRepository.save(book);
    }

    @Override
    public void deleteBook(Long id) {
        bookRepository.deleteById(id);
    }

    @Override
    public List<Book> findAllBooks() {
        return bookRepository.findAll();
    }
}
