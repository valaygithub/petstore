package com.itv.petstore.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.itv.petstore.Services.UserService;
import com.itv.petstore.dtos.RegisterUserDto;

import jakarta.validation.Valid;

@RestController
public class UserController {
    @Autowired
    private UserService userServices;
//adding data
    @PostMapping("/users")
    public ResponseEntity<?> registerUser(@RequestBody  @Valid RegisterUserDto registerUserDto)
    {
        return  new  ResponseEntity<>(this.userServices.registerUser(registerUserDto),HttpStatus.CREATED);
    }
    @GetMapping("/users")
   public ResponseEntity<?>getAll()
   {
    return ResponseEntity.ok(this.userServices.getAll());
   }
}
