package com.uservalidator;

import org.junit.Assert;
import org.junit.Test;

public class FirstNameValidatorTest {
    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue(){
        FirstNameValidator validator = new FirstNameValidator();
        boolean result = validator.validateFirstName("Manjunath");
        Assert.assertEquals(true,result);
    }
       @Test
    public void givenFirstName_WhenShort_ShouldReturnFalse(){
        FirstNameValidator validator = new FirstNameValidator();
        boolean result = validator.validateFirstName("Man");
        Assert.assertEquals(false,result);
    }
    @Test
    public void givenFirstName_WhenWithSpChars_ShouldReturnFalse(){
        FirstNameValidator validator = new FirstNameValidator();
        boolean result = validator.validateFirstName("Manju@nath");
        Assert.assertEquals(false,result);
    }


}
