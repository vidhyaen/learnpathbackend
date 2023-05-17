package com.josi.Controller;



import com.josi.model.Signup;
import com.josi.service.SignupService;
import com.josi.Controller.SignUpController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/signup")
@CrossOrigin
public class SignUpController {
    @Autowired
    private SignupService signupService;
    @PostMapping("/add")
    public String add(@RequestBody Signup signup){
        signupService.saveSignup(signup);
        return"New member added";


    }
    @GetMapping("/getAll")
    public List<Signup> getAllSignup(){
        return signupService.getAllSignup();
    }

}
