import java.util.Random;

public class problem1b {
    /*
    Write a method called generatePassword, which returns
    a String representing a valid password. In writing
    generatePassword, you must call isValid (written in
    part (a)). Assume isValid works correctly regardless of
    what you wrote.
    - The generatePassword method must randomly choose the
      length of the password and randomly choose characters
      from the upper, lower, and symbol Strings.
     */

    int minLength;
    int maxLength;
    String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    String lower = "abcdefghijklmnopqrstuvwxyz";
    String symbols = "!@#$%^&*";

    problem1a isValid;

    // All above this line are provided by the test.

    public problem1b(int minLength, int maxLength) {
        this.minLength = minLength;
        this.maxLength = maxLength;
        isValid = new problem1a(minLength, maxLength);
    }

    public String generatePassword() {
        String bank = upper+lower+symbols;
        StringBuilder password = new StringBuilder();
        Random random = new Random();
        int passLength = maxLength - random.nextInt(maxLength - minLength);
        for (int i = 0; i < passLength; i++) {
            int x = random.nextInt(bank.length());
            password.append(bank.charAt(x));
        }
        return isValid.isValid(password.toString()) ? password.toString() : generatePassword();
    }
}
