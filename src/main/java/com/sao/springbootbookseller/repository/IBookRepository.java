package com.sao.springbootbookseller.repository;/*
 * @created 26/12/2022 - 11:04
 * @project spring-boot-book-seller
 * @author Azzouz
 */

import com.sao.springbootbookseller.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IBookRepository extends JpaRepository<Book,Long> {

}
