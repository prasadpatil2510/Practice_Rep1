/*Problem Statement 4
*Write a program to find the factorial 
*value of any number entered through 
*the keyboard. 
*Prasad Patil 10/10/2021
*/
import java.util.*;

public class ps4{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter the number.");
		int num = sc.nextInt();
		int fact = 1;
		
		for(int i=1; i<=num;i++){
			fact = fact * i;
		}
		System.out.format("The factorial of %d is %d",num,fact);
		
	}
}