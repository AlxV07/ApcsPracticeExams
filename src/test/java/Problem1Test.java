import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Problem1Test {
	problem1a target;

	@BeforeEach
	void setup () {
		// TODO: the constructor needs to initialize minLength and maxLength
		target = new problem1a(6, 124125);
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
			assertFalse(target.isValid(invalidCandidate));
		}

		for (String validCandidate : new String[]{
				"eN$p8r", "sT$v0xyz"
		}) {
			assertTrue(target.isValid(validCandidate));
		}
	}
}
