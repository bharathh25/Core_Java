package com.day7.bharath;
/*
 * Write a method to check if a given string is a valid email.

Must contain @ and '.'

@ should not be at the start or end

Must have a domain after '.'
 */
public class EmailValidator {

    public static boolean isValidEmail(String email) {
        // Basic checks
        if (email == null || email.isEmpty()) return false;
        if (!email.contains("@") || !email.contains(".")) return false;

        int atPos = email.indexOf('@');
        int dotPos = email.lastIndexOf('.');

        // @ should not be at start or end
        if (atPos <= 0 || atPos == email.length() - 1) return false;

        // . must come after @ and not be at the end
        if (dotPos < atPos + 2 || dotPos == email.length() - 1) return false;

        return true;
    }

    public static void main(String[] args) {
        // Test cases
        String[] testEmails = {
            "user@example.com",
            "abc@xyz.in",
            "@missingstart.com",
            "noatsymbol.com",
            "missingdot@com",
            "trailing@dot.",
            "valid.email@domain.co"
        };

        for (String email : testEmails) {
            System.out.println(email + " -> " + (isValidEmail(email) ? "Valid" : "Invalid"));
        }
    }
}
