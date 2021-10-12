package Oct11_2;



public class Arr_max {
	
	public static int maxi(int... numbers) {
		int maximum =numbers[0];
		for(int i = 1 ; i < numbers.length ; i++) {
			if(numbers[i]>maximum) {
				maximum=numbers[i];
			}
		}
		return maximum; 
	}
	public static void main(String[] args) {
		System.out.println(maxi(1,3,5,10, 15,35, 25, 1));
	}
}
