package com.login.login.and.signup.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class UserInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(unique = true)
    private String username;
    //private String email;

    @Column(nullable = false)
    private String password;
    //private String roles;

    @Column(nullable = false)
    private String email;

   private String role;
}
