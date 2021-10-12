/* Separate 3 words separated 
*by comma into 3 words
*Prasad Patil 10/10/2021
*/

import java.util.Scanner;

public class SepString{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the words separated by comma");
		
		String a = sc.nextLine();
		String word1 ="", word2 ="", word3 ="";
		
		int comma1 = a.indexOf(",");
		
		if(comma1>=0) {
			word1 = a.substring(0,comma1);
			int comma2 = a.indexOf("," , comma1 +1);
			
			if(comma2>=0) {
			word2 = a.substring(comma1+1,comma2);
			word3 = a.substring(comma2+1);
			}
			else {
				word2 = a.substring(comma1+1);
				}
			
			}else {
				word1 = a; 
			}
		
		word1 = word1.trim();
		word2 = word2.trim();
		word3 = word3.trim();
		
		System.out.format(" Word1 = %s %n Word2= %s %n Word3= %s ",word1, word2, word3);
		}
	
	
}



