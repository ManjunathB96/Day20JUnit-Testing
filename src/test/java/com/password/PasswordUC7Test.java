package com.password;

import org.junit.Assert;
import org.junit.Test;

public class PasswordUC7Test {
    @Test
    public void givenPassword_WhenValid_ShouldReturnTrue(){
        PasswordUC6 valid = new PasswordUC6();
        boolean result = valid.validatePassword("94");

        Assert.assertEquals(true,result);
    }

}
