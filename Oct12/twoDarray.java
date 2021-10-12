package 
public class twoDarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[][] sales = {
				{30, 12, 25, 35},
				{25, 36, 22, 45},
				{25, 65, 98, 46},
				{52, 56, 58, 98}				
		}
		
		double grandTotal=0.0;
		for(int row = 0; row < sales.length ; row++) {
			for(int col = 0; row < sales[row].length ; col++) {
				grandTotal += grandTotal;
			}
		}
		System.out.println( " The grandTotal is %.2f%n", grandTotal );
	}

}
