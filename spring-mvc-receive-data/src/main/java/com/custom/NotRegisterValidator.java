package com.custom;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * @Author:DENG-
 * @Date:2019/11/13 19:19
 */
public class NotRegisterValidator implements ConstraintValidator<NotRegister,String> {
    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        if(value != null && value == "DENG"){
            return false;
        }else {
            return true;
        }
    }
}
