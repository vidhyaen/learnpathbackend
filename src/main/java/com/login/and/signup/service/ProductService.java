package com.login.login.and.signup.service;

//import com.resumeBuilder.AuthenticateMS.dto.Product;

import com.login.login.and.signup.entity.UserInfo;
import com.login.login.and.signup.repository.UserInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class ProductService {

    @Autowired
    private UserInfoRepository repository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public String addUser(UserInfo userInfo) {
        List<UserInfo> allUsers = repository.findAll();
        System.out.println(userInfo.getPassword());
        try {
            if(userInfo.getPassword() == null || userInfo.getPassword().equals("")){
                throw new Exception("Password Empty or null");
            }
            if(userInfo.getPassword().length() <= 7 || userInfo.getPassword().length() > 16){
                throw new Exception("Password should be between 8 - 16 characters");
            }
            if(userInfo.getPassword().contains(" ")){
                throw new Exception("Password cannot contain spaces");
            }
            userInfo.setPassword(passwordEncoder.encode(userInfo.getPassword()));
            for(UserInfo u : allUsers){
                if(userInfo.getUsername().equals(u.getUsername())){
                    throw new Exception("Duplicate Username");
                }
            }
            repository.save(userInfo);
        }catch (Exception e){
            return e.getMessage();
        }
        return "user added to system";
    }

    public List<UserInfo> getAllUsers() {

         List<UserInfo> allUsers = repository.findAll();
        return allUsers;
    }

    //get all users

        
    
}
