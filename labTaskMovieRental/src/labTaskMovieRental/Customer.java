package labTaskMovieRental;

import java.util.Enumeration;
import java.util.Vector;

public class Customer {
	private String _name; 
	private Vector<Rental> _rentals = new Vector<Rental>(); 
	 
	   public Customer (String name){  
		   _name = name;  
	   } 
	 
	   public void addRental(Rental arg) {  
		   _rentals.addElement(arg);    }    
	   public String getName (){     
		   return _name;
}
	   public String statement() {      

		   Enumeration<Rental> rentals = _rentals.elements();     
		   String result = "Rental Record for " + getName() + "\n";     
		   while (rentals.hasMoreElements()) {         
			           
			   Rental each = (Rental) rentals.nextElement(); 
	    
	 
	            //show figures for this rental     
			   result += "\t" + each.getMovie().getTitle()+ "\t" + each.getCharge() + "\n";     
			  
	 
	        }         //add footer lines    
		   result +=  "Amount owed is " + String.valueOf(getTotalCharge()) + "\n";      
		   result += "You earned " + String.valueOf(getTotalFrequentRenterPoints()) + " frequent renter points";    
		   return result; 
			   }

	int getFrequentRenterPoints(Rental each) {
	        
   if ((each.getMovie().getPriceCode() == Movie.NEW_RELEASE) && each.getDaysRented() > 1) 
		   return 2;
		   else return 1;
		
	}

	   private double amountFor(Rental aRental) {   
		   return aRental.getCharge(); 
	   }

	   private double getTotalCharge() {     
		   double result = 0;      
		   Enumeration<Rental> rentals = _rentals.elements();    
		   while (rentals.hasMoreElements()) {        
			   Rental each = (Rental) rentals.nextElement();     
			   result += each.getCharge();    
		   } 
		   return result;   
		   } 
	   private int getTotalFrequentRenterPoints(){    
		   int result = 0;   
		   Enumeration<Rental> rentals = _rentals.elements(); 
		   while (rentals.hasMoreElements()) {     
			   Rental each = (Rental) rentals.nextElement();   
			   result += getFrequentRenterPoints(each);
			   }     
		   return result;      } 
	   }