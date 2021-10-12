/* 
*Ask user to input a year 
*and (until finished is true)
*tell them leap year or not. 
*/

import java.util.*;

public class LeapBoolean{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		boolean finished = false; 
		
		System.out.println("Please enter the year to check leap or not");
		int year=sc.nextInt();
		
		while (!finished){
		
		if (year%4==0){
			System.out.format("The year %d is leap year.",year);
		} else {
			System.out.format("The year %d is not a leap year.",year);
		}
		System.out.println("Type 1 to exit or Enter Year. ");
		year = sc.nextInt();
		if(year ==1){
			finished= true;
			System.out.println("Finished.");
		}
			
		}
		
	}
	}
