
import java.util.*;
public class PS3{
	public static void main(String[] args){
		System.out.println("Please Enter the number");
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		for(int i = 1; i<=10; i++){
			int numi = num * i;
			System.out.format("%d * %d = %d %n",num,i,numi);
			
		}
		
	}
}