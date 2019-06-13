package compareRect;

import java.util.Scanner;

public class compare {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		Rectangle rectangle1 = rectInfo(cin);
		Rectangle rectangle2 = rectInfo(cin);
		int area1 = rectangle1.getArea();
		int area2 = rectangle2.getArea();
		if (area1 == area2) {
			System.out.println("Equal");
		}
		
		

	}
	
	public static Rectangle rectInfo(Scanner cin) {
		System.out.println("Rectangle Info");
		System.out.println("Enter width");
		int width = cin.nextInt();
		System.out.println("Enter Length");
		int length = cin.nextInt();
		Rectangle rectangle1 = new Rectangle(width,length);
		return rectangle1;
		
	}

}
