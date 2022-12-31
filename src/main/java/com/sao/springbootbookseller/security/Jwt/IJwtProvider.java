package com.sao.springbootbookseller.security.Jwt;/*
 * @created 26/12/2022 - 21:39
 * @project spring-boot-book-seller
 * @author Azouz
 */

import com.sao.springbootbookseller.security.UserPrincipal;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;

import javax.servlet.http.HttpServletRequest;

public interface IJwtProvider
{
    String generateToken(UserPrincipal auth);

    UsernamePasswordAuthenticationToken getAuthentication(HttpServletRequest request);

    boolean validateToken(HttpServletRequest request);
}