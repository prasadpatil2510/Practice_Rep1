/*Two numbers are entered through the keyboard. 
*Write a program to find the value of one 
*number raised to the power of another. 
*(Without Java built-in method)
*/

import java.util.*;

public class ps5{
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Enter the base number.");
	int base = sc.nextInt();
	
	System.out.println("Enter the power.");
	int power = sc.nextInt();
	int ans = 1;

	for(int i=1;i<=power;i++) {
		ans *= base;
			}
	System.out.println("x^y="+ ans);
}

}