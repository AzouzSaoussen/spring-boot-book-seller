package com.sao.springbootbookseller.service;/*
 * @created 26/12/2022 - 11:17
 * @project spring-boot-book-seller
 * @author Azzouz
 */

import com.sao.springbootbookseller.model.User;

import java.util.Optional;

public interface IUserService {
    User saveUser(User user);

    Optional<User> findByUsername(String username);

    void makeAdmin(String username);
}
