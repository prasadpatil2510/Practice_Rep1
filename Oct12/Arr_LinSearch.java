

import java.util.Scanner;

public class Arr_LinSearch {

		public static int search( int[] numb , int value ) {
			/* WITH TWO RETURN
			 * for(int position = 0 ; position < numb.length ; position++) {
			 * if(numb[position]==value) { return position; } } return -1;
			 */
			
			//WITH SINGLE RETURN
			int position = 0 ;
			while ( position < numb.length && numb [ position ] != value ) {
				position++ ; 
			}
			return (( position < numb.length ) ? position : -1  );
	}
		
	public static void main(String[] args) {
		Scanner val = new Scanner(System.in) ;
		int value = 0 ;
		int[] numb = { 12, 13, 14, 15, 25, 35 } ;
		
		do {
			System.out.println( "Enter the value to search or Type 0" ) ;
			value = val.nextInt();
			if ( value != 0 ) {
				int foundAt = search ( numb , value ) ;
				System.out.printf( "The number %d found at %d %n" , value , foundAt ) ;				
			}
			//System.out.printf("The number %d is not found in the array. %n",value);
		} while ( value != 0 ) ;
			
}
}
