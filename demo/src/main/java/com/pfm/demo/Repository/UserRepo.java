package com.pfm.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.pfm.demo.Model.User;

public interface UserRepo extends JpaRepository<User,Integer>{
    
    User findbyEmailId(@Param("email")String email);
}
