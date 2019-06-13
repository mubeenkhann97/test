package labTaskMovieRental;

public class shop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


				Movie m1 = new Movie("john wick",0);
				Movie m2 = new Movie("Tiger",1);
				Movie m3 = new Movie("Sultan",2);
				
				
				Rental r1 = new Rental(m1,4);
				Rental r2 = new Rental(m3,4);
				Rental r3 = new Rental(m3,6);
				
				Customer c1 = new Customer("Arslan");
				Customer c2 = new Customer("Rafay");
				
				
				c1.addRental(r1);
				c2.addRental(r2);
				c1.addRental(r3);
				
				
				String display = c1.statement();
				System.out.println(display);
				
				String display1 = c2.statement();
				System.out.println(display1);
	
	}

}
