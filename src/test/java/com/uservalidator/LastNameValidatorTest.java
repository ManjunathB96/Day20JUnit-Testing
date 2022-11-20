package com.uservalidator;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class LastNameValidatorTest{


    @Test
    public void givenLastName_WhenProper_ShouldReturnTrue() {
        LastNameValidator validator = new LastNameValidator();      //shortcut: ctrl+alt+v
        boolean result = validator.ValidateLastName("Belagavi");
        Assert.assertTrue(result);
    }


    @Test
    public void givenLastName_WhenNotProper_ShouldReturnTrue() {
        LastNameValidator validator = new LastNameValidator();      //shortcut: ctrl+alt+v
        boolean result = validator.ValidateLastName("Belag");
        Assert.assertTrue(result);
    }

}