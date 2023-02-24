import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BinaryOperator;

import static org.junit.jupiter.api.Assertions.*;

public class Problem1Test {
	problem1a aTarget;
	problem1b bTarget;

	@BeforeEach
	void setup () {
		// TODO: the constructor needs to initialize minLength and maxLength
		aTarget = new problem1a(6, 124125);
		bTarget = new problem1b(6, 124125);
	}

	@Test
	public void isValidShouldIdentifyValidPasswords () {
		// TODO: Test valid length
		// TODO: Test capital letter
		// TODO: Test lowercase letters
		// TODO: Test number


		for (String invalidCandidate : new String[]{
				"abc", "123", "ABC", "#$@!", "aB$5", "d6$G", "hI7$l"
		}) {
			assertFalse(aTarget.isValid(invalidCandidate));
		}

		for (String validCandidate : new String[]{
				"eN$p8r", "sT$v0xyz"
		}) {
			assertTrue(aTarget.isValid(validCandidate));
		}
	}

	@Test
	public void shouldGenerateValidPassword() {
		for (String shouldBeValid : new String[]{
				bTarget.generatePassword(), bTarget.generatePassword(), bTarget.generatePassword()
		}) assertTrue(aTarget.isValid(shouldBeValid));
	}

	@Test
	void shouldUseAllCharsWithEqualProbability() {
		String alphabet = bTarget.lower + bTarget.symbols + bTarget.upper;
		int nofChars = alphabet.length();
		System.out.println("testing password alphabet with " + nofChars + " characters");

		// We expect to generate roughly each character this many times after total runs
		int expectedOccurrence = 10;
		int totalRuns = expectedOccurrence * nofChars;
		// Generate password for enough times and count occurrences for each char in the alphabet
		Map<Character, Integer> result = new HashMap<>();
		for (int i = 0; i < totalRuns; i++) {
			String pass = bTarget.generatePassword();
			for (char c : pass.toCharArray()) {
				incrementCharCount(c, result);
			}
		}

		int total = result.values().stream().reduce(0, Integer::sum);
		// Verify that the count is close enough
		for (char c : alphabet.toCharArray()) {
			Integer count = result.get(c);
			if (count == null) {
				fail(String.format("Character [%c] has never been generated\n", c));
			} else {
				System.out.printf("Character [%c] has been generated [%d] times\n", c, count);
				int expectedCount = total / nofChars;
				assertTrue(Math.abs(count - expectedCount) <= 0.005 * expectedCount);
			}
		}
	}

	private void incrementCharCount(char c, Map<Character, Integer> result) {
		result.merge(c, 1, Integer::sum);
	}
}
