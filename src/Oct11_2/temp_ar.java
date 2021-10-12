package Oct11_2;

public class temp_ar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] temp = {45, 44, 39, 48, 37, 46, 53, 45, 46, 38 , 32 ,36 , 88, 56, 48, 5};
		
		int total=0;
		for ( int index=0; index<temp.length  ;index++) {
			total += temp[index];
		}
		double avg = total/temp.length;
		System.out.println("Average= "+avg );
		
		int aAvg =0;
		for(int index = 0; index < temp.length ; index++ ) {
		if(temp[index]>avg) {
			aAvg++;
		}
		}
		System.out.printf("The number of above average days: %d %n", aAvg);
		System.out.printf("The number of below average days: %d %n", temp.length-aAvg);
	}

}
