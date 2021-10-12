
public class Practice_1 {
	public static void main(String[] args) {
		String[] str = {"Prasad", "is", "Here"};
		/*System.out.println("" );
		for(String item:str) {
			System.out.println(item);
		}
		*/
		for(int i=0;i<=2;i++) {
			System.out.println("This is i at" + i);
			for(int j=i;j<=5;j++) {
				System.out.println("This is j at "+j);
				continue;
			}
		}
	}

}
