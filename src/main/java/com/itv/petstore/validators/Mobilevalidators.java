package com.itv.petstore.validators;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class Mobilevalidators  implements ConstraintValidator<mobile, String>{

    

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
       
        boolean condition=value.length()==10 && value.matches("[0-9]+");
        return condition;
      
    }
}


    
   
  