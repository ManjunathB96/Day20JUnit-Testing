package com.uservalidator;

import java.util.regex.Pattern;

public class LastNameValidator {
    private static final String LAST_NAME_PATTERN = "^[A-Z]{1}[a-z]{2,}$";

    public boolean ValidateLastName(String lname){
        Pattern pattern = Pattern.compile(LAST_NAME_PATTERN);
        return  pattern.matcher(lname).matches();
    }
}
