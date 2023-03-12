package PracticeExam1;

public class Problem1a {
    /*
    Write a method called isValid, which returns true
    if the password is valid and false otherwise. A
    password is considered valid if:
       - Its length is a valid length.
       - It contains at least one uppercase letter, one
         lowercase letter, and one symbol.
     */

    int minLength;
    int maxLength;
    String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    String lower = "abcdefghijklmnopqrstuvwxyz";
    String symbols = "!@#$%^&*";

    // All above this line are provided by the test.
    public Problem1a(int minLength, int maxLength) {
        this.minLength = minLength;
        this.maxLength = maxLength;
    }

    public boolean isValid(String password) {
        if (password.length() >= minLength && password.length() <= maxLength) {
            boolean hasUpper = false;
            boolean hasLower = false;
            boolean hasSymbol = false;
            for (int j = 0; j < password.length(); j++) {
                if (hasUpper && hasLower && hasSymbol) {
                    break;
                } else {
                    if (upper.contains(password.substring(j, j + 1))) {
                        hasUpper = true;
                    } else if (lower.contains(password.substring(j, j + 1))) {
                        hasLower = true;
                    } else if (symbols.contains(password.substring(j, j + 1))) {
                        hasSymbol = true;
                    }
                }
            }
            return hasUpper && hasLower && hasSymbol;
        } else {
            return false;
        }
    }
}
