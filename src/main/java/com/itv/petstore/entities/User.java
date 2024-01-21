package com.itv.petstore.entities;

import lombok.Data;

@Data
public class User {
    private Integer id;
    private String firstname;
    private String lastname;
    private String email;
    private String password;
    private String confirm;
    private String mobile;

    private long salary;
   
    
    
    
    
}
