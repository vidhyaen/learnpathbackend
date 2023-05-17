package com.josi.service;
import com.josi.model.Course;
import com.josi.model.Signup;
import com.josi.repository.SignupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class UserServiceImpl implements SignupService{
    @Autowired
    private SignupRepository signupRepository;

    @Override
    public Signup saveSignup(Signup signup) {
        return signupRepository.save(signup);
    }

    @Override
    public List<Signup> getAllSignup() {
        return signupRepository.findAll();
    }

}
