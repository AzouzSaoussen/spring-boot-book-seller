package com.sao.springbootbookseller.service;/*
 * @created 26/12/2022 - 11:18
 * @project spring-boot-book-seller
 * @author Azzouz
 */

import com.sao.springbootbookseller.model.Role;
import com.sao.springbootbookseller.model.User;
import com.sao.springbootbookseller.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Optional;

@Service
public class UserService implements IUserService{
    @Autowired
    private IUserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public User saveUser(User user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        user.setRole(Role.USER);
        user.setCreateTime(LocalDateTime.now());

        return userRepository.save(user);
    }

    @Override
    public Optional<User> findByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    @Override
    public void makeAdmin(String username) {
        userRepository.updateUserRole(username, Role.ADMIN);

    }
}
