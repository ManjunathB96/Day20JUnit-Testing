package com.password;

import org.junit.Assert;
import org.junit.Test;

import java.util.regex.Pattern;

public class PasswordUC8Test {
    @Test
    public void givenPassword_WhenValid_ShouldReturnTrue(){
        PasswordUC8 valid = new PasswordUC8();
        boolean result = valid.validatePassword("Ma@");

        Assert.assertEquals(true,result);
    }
}
