package com.email;

import javax.swing.plaf.PanelUI;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidEmailUC3 {
    final String EMAIL_PATTERN ="^[a-zA-Z0-9]+[@][a-z]+[\\.][a-z]{2,3}";
    public boolean validateEmailAddress(String email){
            Pattern pattern = Pattern.compile(EMAIL_PATTERN);
            return pattern.matcher(email).matches();
        }

    }

