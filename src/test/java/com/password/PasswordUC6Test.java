package com.password;

import org.junit.Assert;
import org.junit.Test;

public class PasswordUC6Test {
    @Test
    public void givenPassword_WhenValid_ShouldReturnTrue(){
       PasswordUC6 valid = new PasswordUC6();
        boolean result = valid.validatePassword("Ma");

        Assert.assertEquals(true,result);
    }
}
