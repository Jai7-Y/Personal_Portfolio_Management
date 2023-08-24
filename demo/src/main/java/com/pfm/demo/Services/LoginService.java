package com.pfm.demo.Services;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pfm.demo.Model.User;
import com.pfm.demo.Repository.UserRepo;
import com.pfm.demo.Utils.Response;

@Service
public class LoginService {

    @Autowired
    private UserRepo userRepo;
    private Response response = new Response();


    public String loginUser(User user){
        User olduser = userRepo.findbyEmailId(user.getEmail());
        if(Objects.isNull(olduser)){
            return response.getResponse("Message", "User Does Not Exist !");
        }else{
            if(user.getPassword().equals(olduser.getPassword())){
                return response.getResponse("Message", "Successfully Login !");
            }else{
                return response.getResponse("Message", "Password is Incorrect");
            }
        }
    }

}
