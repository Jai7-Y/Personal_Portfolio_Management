package com.pfm.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.pfm.demo.Model.User;
import com.pfm.demo.Services.LoginService;

@RestController
public class Login {

    @Autowired
    private LoginService loginService;

    @PostMapping("/login")
    private String loginUser(@RequestBody(required=true)User user){
        return loginService.loginUser(user); 
    }

}
