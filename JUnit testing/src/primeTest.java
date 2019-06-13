import static org.junit.Assert.*;

import org.junit.Test;

public class primeTest {

	@Test
	public void test() {
		boolean check;
		JUnitTesting j1 = new JUnitTesting();
		check = j1.isPrime(101);
		assertEquals(true,check);
	
	}

}
