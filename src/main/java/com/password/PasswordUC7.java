package com.password;

import java.util.regex.Pattern;

public class PasswordUC7 {
    final String PASSWORD_PATTERN ="^(?=.*[0-9]).{1,}$";
    public boolean validatePassword(String password){
        Pattern pattern = Pattern.compile(PASSWORD_PATTERN);
        return pattern.matcher(password).matches();
    }

}
