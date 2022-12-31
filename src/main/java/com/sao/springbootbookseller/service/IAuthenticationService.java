package com.sao.springbootbookseller.service;

/*
 * @created 27/12/2022 - 11:22 AM
 * @project spring-boot-book-seller
 * @author Azzouz
 */


import com.sao.springbootbookseller.model.User;

public interface IAuthenticationService {
    User signInAndReturnJWT(User signInRequest);
}

