package PracticeExam4;

public class Problem3 {
    /*
    A class is designed to store someone's full name. You can assume the name has only space between the first
    name and last name. The class has methods to extract the first name, lastname, and number of vowels in a name.
    An example:
    String fullName = "Katherine Johnson";
    Name.getFirstName(fullName); // Returns "Katherine
    Name.getLastName(fullName); // Returns "Johnson"
    Name.countVowels(fullName); // Returns 6
     */

    static class Name {
        public static String getFirstName(String name) {
            /*
            PART (A):
            Write the getFirstName method.
             */
            return name.split(" ")[0];
        }

        public static String getLastName(String name) {
            /*
            PART (B):
            Write the getLastName method.
             */
            return name.split(" ")[1];
        }

        // Own variable
        private static final String vowels = "aeiou";
        public static int countVowels(String name) {
            /*
            PART (C):
            Write the countVowels method.
             */
            int count = 0;
            for (char c : name.toCharArray()) {
                if (vowels.indexOf(c) != -1) {
                    count++;
                }
            }
            return count;
        }
    }
}
