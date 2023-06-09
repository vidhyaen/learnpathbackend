package com.login.login.and.signup.controller;


import com.login.login.and.signup.dto.AuthRequest;
import com.login.login.and.signup.entity.UserInfo;
import com.login.login.and.signup.service.JwtService;
import com.login.login.and.signup.service.ProductService;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class MainController {

    @Autowired
    private ProductService service;
    @Autowired
    private JwtService jwtService;

    @Autowired
    private AuthenticationManager authenticationManager;

    @PostMapping("/create-user")
    @CrossOrigin(origins = "http://localhost:3000")
    public String addNewUser(@RequestBody UserInfo userInfo) {
        return service.addUser(userInfo);
    }

    @GetMapping("/validate-token")
    @CrossOrigin(origins = "http://localhost:3000")
    public Boolean isTokenValid(@RequestHeader("Authorization") String token){
        token = token.substring(7);
        return jwtService.validateToken(token);
    }

    @GetMapping("/extract-username")
    public String usernameFromToken(@RequestHeader("Authorization") String token){
        token = token.substring(7);
        return jwtService.extractUsername(token);
    }
   //get all user info
    @GetMapping("/getusers")
    @CrossOrigin(origins = "http://localhost:3000")
    public List<UserInfo> getAllUsers(){
        return service.getAllUsers();
    }
    @PostMapping("/login")
    @CrossOrigin(origins = "http://localhost:3000")
    public String authenticateAndGetToken(@RequestBody AuthRequest authRequest) {
        Authentication authentication = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(authRequest.getUsername(), authRequest.getPassword()));
        if (authentication.isAuthenticated()) {
            return jwtService.generateToken(authRequest.getUsername());
        } else {
            throw new UsernameNotFoundException("invalid user request !");
        }
    }
}
