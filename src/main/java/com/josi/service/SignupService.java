package com.josi.service;
import com.josi.model.Signup;
import java.util.List;

public interface SignupService {
    public Signup saveSignup(Signup signup);
    public List<Signup> getAllSignup();
}
