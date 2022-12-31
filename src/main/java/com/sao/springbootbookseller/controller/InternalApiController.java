package com.sao.springbootbookseller.controller;/*
 * @created 27/12/2022 - 3:24 PM
 * @project spring-boot-book-seller
 * @author Azzouz
 */

import com.sao.springbootbookseller.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/internal")
public class InternalApiController {
    @Autowired
    private IUserService userService;

    @Transactional
    @PutMapping("make-admin/{username}") //api/internal/make-admin/{username}
    public ResponseEntity<?> makeAdmin(@PathVariable String username)
    {
        userService.makeAdmin(username);

        return new ResponseEntity<>(HttpStatus.OK);
    }
}
