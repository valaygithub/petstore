package com.itv.petstore.Services;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.stereotype.Service;

import com.itv.petstore.dtos.RegisterUserDto;
import com.itv.petstore.entities.User;

@Service
public class UserService {
    private Map<Integer,User>users=new HashMap<>();
    private AtomicInteger atomic=new AtomicInteger();


        
     public User registerUser(RegisterUserDto regResisterUserDto)
    {
        User user=new User();
       user.setId(atomic.incrementAndGet());
        user.setFirstname(regResisterUserDto.getFirstname());
         user.setLastname(regResisterUserDto.getLastname());
          user.setEmail(regResisterUserDto.getEmail());
           user.setPassword(regResisterUserDto.getPassword());
           //user.setConfirmpassword(regResisterUserDto.getConfirm());
           user.setConfirm(regResisterUserDto.getConfirm());
            user.setMobile(regResisterUserDto.getMobile());
               user.setSalary(regResisterUserDto.getSalary());
         return users.put(user.getId(),user);
          }

         
           public Collection<User>getAll()
    {
        return users.values();
    }
}
