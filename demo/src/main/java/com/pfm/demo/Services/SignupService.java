package com.pfm.demo.Services;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pfm.demo.Model.User;
import com.pfm.demo.Repository.UserRepo;
import com.pfm.demo.Utils.Response;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class SignupService {
    
    @Autowired
    private UserRepo userRepo;

    public String userSignup(User newUser){
        log.info("Inside Signup {}" , newUser);
        User user = userRepo.findbyEmailId(newUser.getEmail()); 
        Response response=new Response();
        if(Objects.isNull(user)){
            userRepo.save(newUser);
            return response.getResponse("message","Registered Successfully !");
        } else{
            return response.getResponse("Message","User Already Exist!");
        }   
    }

}
