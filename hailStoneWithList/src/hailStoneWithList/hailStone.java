package hailStoneWithList;

import java.util.ArrayList;
import java.util.Scanner;

public class hailStone {
	
	    public static ArrayList<Integer> getHailstoneSequence(int n){
	    	ArrayList<Integer> results = new ArrayList<Integer>();
	    	results.add(n);
	    	if (n == 1) return results;

	    	int next = results.get(0);
	    	if (n % 2 == 0) next = n / 2;
	    	else next = 3*n + 1; 
	    	results.add(next);

	    	while (next != 1) {
	    	    if (next % 2 == 0) next = next / 2;
	    	    else next = 3*next + 1; 
	    	    results.add(next);
	    	} 
	    	return results;
	    }
	    

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n ");
        n=sc.nextInt();
        sc.close();

        //create an initialize new array list to hold results of the hailstonesequence
        ArrayList<Integer> list;
        list = new ArrayList<Integer>();

       list = getHailstoneSequence(n);

        //for each number in the array
       for(int i=0; i< list.size(); i++){

           if ((list.get(i)!= 1)){
            if((list.get(i)%2)==0){
                    System.out.println(list.get(i)+" is even so I divide by 2: "+ (list.get(i+1)));

                   }
                else{
                    //odd
                    System.out.println(list.get(i)+" is odd so I make it 3n+1: "+ (list.get(i+1)));

                }
           }
           else{break;}
        }

    }

    }

