import static org.junit.Assert.*;

import org.junit.Test;

public class checkEven {

	@Test
	public void test() {
		boolean check;
		JUnitTesting j1 = new JUnitTesting();
		check = j1.isEven(10);
		assertEquals(true,check);
	}

}
