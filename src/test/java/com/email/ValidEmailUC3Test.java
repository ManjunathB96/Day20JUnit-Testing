package com.email;

import org.junit.Assert;
import org.junit.Test;

public class ValidEmailUC3Test {
    @Test
    public void givenEmail_WhenVaid_ShouldReturnTrue(){
        ValidEmailUC3 valid = new ValidEmailUC3();
        boolean result = valid.validateEmailAddress("bbelagavi6@gmail.com");

        Assert.assertEquals(true,result);
    }
}
