package com.itv.petstore.dtos;



import com.itv.petstore.validators.VerifyPassword;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
@VerifyPassword(Filed="password", matchingFiled = "confirm")

//@VerifyPassword(Filed="password" ,matchingFiled = "confirmPassword")
public class RegisterUserDto {
    

    private Integer id;
    
    
    @NotNull @NotEmpty
    @Size(min=4 ,max=10,message="first name should have length btw 4 to 10")
    private String firstname;

    @NotNull @NotEmpty
    private String lastname;
    
    @NotNull @NotEmpty
    private String email;

   // @com.itv.petstore.validators.VerifyPassword(Filed = "password", matchingFiled = "confirmPassword")

    
    private String password;
   
    
    private String confirm;
   
    @NotNull @NotEmpty
    @com.itv.petstore.validators.mobile
    private String mobile;
    
    @Min(value=10000, message="min salary should be 10000")
    @Max(value=100000, message="max salary should be 100000")
    
    private long salary;
   
    
    
}

