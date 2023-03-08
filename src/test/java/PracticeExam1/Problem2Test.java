package PracticeExam1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Problem2Test {
    problem2.ISBN isbn;
    problem2.ISBN isbn2;

    @BeforeEach
    public void setup() {
        isbn = new problem2.ISBN(126045491);
        isbn2 = new problem2.ISBN(900006001);
    }

    @Test
    public void checkCheckDigit() {
        String digit = isbn.calculateCheckDigit();
        String digit2 = isbn2.calculateCheckDigit();
        assertEquals(digit, "6");
        assertEquals(digit2, "X");
    }

    @Test
    public void checkGeneratedNumber() {
        String digit = isbn.generateNumber();
        String digit2 = isbn2.generateNumber();
        assertEquals(digit, "126045491-6");
        assertEquals(digit2, "900006001-X");
    }
}
