
public class JUnitTesting {
	
public int square(int num) {
	return num*num;
}
public boolean isPrime(int num) {
	if (num == 1) {
		return false;
	}
	for (int i=2;i<=Math.sqrt(num);i++) {
		if (num%i == 0) {
			return false;
		}
	}
	return true;
}
public boolean isEven(int num) {
	if (num%2==0) {
		return true;
	}
	else {
		return false;
	}
}
}
