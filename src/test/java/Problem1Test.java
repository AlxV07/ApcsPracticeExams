import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

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
}
