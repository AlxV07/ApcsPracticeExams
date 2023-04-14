package PracticeExam3;

public class Problem1 {
    /*
    PART (A):
    Write the method convertToBinary(), which converts an integer decimal number to a String
    representation of that number and returns it in binary format.
     */
    public static String convertToBinary(int num) {
        if (num > 0) {
            return (num % 2) + convertToBinary(num / 2);
        } else {
            return "";
        }
//        return Integer.toBinaryString(num); // Ha
    }

    /*
    PART (B):
    Write the method convertToDecimal, which takes a String binary representation of a number
    and returns the number represented.
     */
    public static String convertToDecimal(String binary) {
        String[] splitNum = binary.split("");
        int num = 0;
        for (int i = splitNum.length - 1; i >= 0; i--) {
            num += Math.pow(2, i) * Integer.parseInt(splitNum[i]);
        }
        return String.valueOf(num);
//        return String.valueOf(Integer.parseInt(binary, 2)); // Ha
    }
}
