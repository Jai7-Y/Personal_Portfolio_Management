package com.pfm.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.pfm.demo.Model.User;
import com.pfm.demo.Services.SignupService;

@RestController
public class Signup {

    @Autowired
    private SignupService signupService;

    @PostMapping("/signup")
    private String userCredentials(@RequestBody(required = true)User newUser){
        return signupService.userSignup(newUser);
    } 



}
