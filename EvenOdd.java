package MS3.LogicalExercise1;

import java.util.Scanner;

public class EvenOdd {
	public static void main(String[] args) {
		
		  int x;
	      System.out.println("Enter an integer to check if it is odd or even ");
	      Scanner s = new Scanner(System.in);
	      x = s.nextInt();
	 
	      if ( x % 2 == 0 )
	         System.out.println("You entered an even number.");
	      else
	         System.out.println("You entered an odd number.");
	   }
	
				
	}


