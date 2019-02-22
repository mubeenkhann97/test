package labTask1;
import java.util.Scanner;
public class yearDay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int year,month,dayOfMonth;
 				System.out.println("Enter month :: "); 				//enter the month number
 				month = sc.nextInt();
		 		System.out.println("Enter an day of month :: "); 	//enter the day of the month
		 		dayOfMonth = sc.nextInt();
		 		System.out.println("Enter an Year :: "); 			//enter the year
		 		year = sc.nextInt();
		 		sc.close();
		int dayOfYear = dayOfYear(month,dayOfMonth,year);
				System.out.println("day of year is "+dayOfYear);
				System.out.println("day of agcvhjsgfjhsfgkjdfhdkjghkdhg");
				
	}

	/**
	 * Calculate the day of year
	 * @param "month" the month for which day is to be calculated ;
	 * @param "year" the year for which day is to be calculated ;
	 * @param "dayOfMonth" days that have been passed in that month ;
	 * @return dayOfMonth the current day of the year;
	 */
	public static int dayOfYear(int month,int dayOfMonth,int year) {
		
		int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};
		int feb = 2,march=3,april=4,may=5,june=6,july=7,aug=8,sep=9,oct=10,nov=11,dec=12;
		
		 if(isLeapYear(year)) {			//if year is not a leap year add 28 to the day of Month
		        days[1]= 29;
		    	}
		  
		 if (month >= feb) {
		        dayOfMonth += days[0];
		    } 
		 if (month >= march) {
			 
		        dayOfMonth += days[1];
		    }
		 if (month >= april) {
		        dayOfMonth += days[2];
		    }
		 if (month >= may) {
		        dayOfMonth += days[3];
		    } 
		 if (month >= june) {
		        dayOfMonth += days[4];
		    } 
		 if (month >= july) {
		        dayOfMonth += days[5];
		    } 
		 if (month >= aug) {
		        dayOfMonth += days[6];
		    } 
		 if (month >= sep) {
		        dayOfMonth += days[7];
		    } 
		 if (month >= oct) {
		        dayOfMonth += days[8];
		    } 
		 if (month >= nov) {
		        dayOfMonth += days[9];
		    } 
		 if (month >= dec) {
		        dayOfMonth += days[10];
		    }
		   
		 return dayOfMonth;
		
	
	}
	/**
	 * Check leap year
	 * @param "year" the current year ;
	 * @return the boolean result if leap year, true false otherwise;
	 *         For example, isLeapYear(2017)=false;
	 */
	public static boolean isLeapYear(int year) {
	      if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0))
	         return true;
	      else
	         return false;
	}
}
