import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class squareTest {

	@Test
	void test() {
		JUnitTesting j1 = new JUnitTesting();
		int output = j1.square(7);
		assertEquals(49,output);
	}

}
