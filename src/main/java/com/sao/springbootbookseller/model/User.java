package com.sao.springbootbookseller.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Objects;

@Getter
@Setter
@ToString
@RequiredArgsConstructor

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;
    @Column(name="username", unique = true,nullable = false,length = 100)
    private String username;
    @Column(name="password",nullable = false,length = 100)
    private String password;
    @Column(name="name",nullable = false,length = 100)
    private String name;
    @Column(name="create_time",nullable = false)
    private LocalDateTime createTime;

    //role
    @Enumerated(EnumType.STRING)
    @Column(name="role", nullable = false)
    private Role role;

    @Transient
    private String token;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        User user = (User) o;
        return id != null && Objects.equals(id, user.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }




}
