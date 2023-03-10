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
            int a = 0;
            String check = "";
            for (int i = 0; i < 3; i++) {
                switch (i) {
                    case 0 -> check = upper;
                    case 1 -> check = lower;
                    case 2 -> check = symbols;
                }
                for (int j = 0; j < password.length(); j++) {
                    if (check.contains(password.substring(j, j + 1))) {
                        a++;
                        break;
                    }
                }
            }
            return a==3;
        }
        return false;
    }
}
