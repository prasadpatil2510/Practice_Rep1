package Oct11_2;
import java.util.Scanner;

public class factor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a number greater than 2:");
		int n = input.nextInt();

		int factor = 2;
		boolean found = false;
		while (factor <= n && !found) {
			if (n % factor == 0) {
				found = true;
			} else {
				factor++;
			}
		}

		System.out.printf("The smallest factor of %d is %d.\n", n, factor);

		input.close();

	}

}
