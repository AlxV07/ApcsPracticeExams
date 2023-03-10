package PracticeExam2;

public class Problem1 {

    /*
   To represent a given number as a Location Numeral (LN), the number is expressed as the sum of powers of two with each power of two replaced by its corresponding letter.
    A = 2 to the power of 0, B = 2 to the power of 1, C = 2 to the power of 2, etc.

    The decimal number 19 can be represented as a sum of powers of 2, as shown below:
    16 + 2 + 1 = 2 power 4, 2 power 1, 2 power 0

    Problem 1a) Write the method getLetterValue that returns the numerical value of a single LN letter.
    Problem 1b) Write the method getDecimalValue that takes an LN and returns its decimal value.
    Problem 1c) Write the method buildLocationNumeral that takes a decimal value and returns the LN representation of that decimal value.
     */

    String bank = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    // Problem 1a
    public int getLetterValue(String l) {
        return (int) Math.pow(2, bank.indexOf(l));
    }

    // Problem 1b
    public int getDecimalValue(String n) {
        int sum = 0;
        String[] ray = n.split("");
        for (String i : ray)
            sum += getLetterValue(i);
        return sum;
    }

    // Problem 1c
    public String buildLocationNumeral(int x) {
        int p = getLargestPower(x);
        String ln = bank.substring(p, p+1);
        return (x - Math.pow(2, p) == 0) ? ln : ln+buildLocationNumeral((int) (x - Math.pow(2, p)));
    }

    public int getLargestPower(int x) {
        int z = 0;
        while (Math.pow(2, z) <= x && z <= 25)
            z++;
        return (z == 0) ? z : z-1;
    }
}
