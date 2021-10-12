/* Quadratic Equations
 * Prasad Patil, 8/10/2021
*/

import java.util.Scanner;
import java.lang.Math;


public class Quadratic_Equation {
	public static void main(String[] args){
		Scanner sc1 = new Scanner(System.in);

		//Getting user input
		System.out.format("Enter the first number of Equation : %n a= ");
		int a = sc1.nextInt();
		System.out.format("Enter the Second number of Equation: %n b= ");
		int b = sc1.nextInt();
		System.out.format("Enter the Third number of Equation: %n c= ");
		int c = sc1.nextInt();
		
		
		
		//Formula
		double x1 = b*b - 4*a*c; // get this squared root
		double x2 = Math.sqrt(x1);
		double x3 = (-b + x2)/(2*a);
		double x4 = (-b - x2)/(2*a);
		
		//Displaying answers
		System.out.format("The value of x is %.2f: or %.2f",x3, x4);
	
}


}
