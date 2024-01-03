import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String temp = "";
		int A = sc.nextInt();
		
		for(int i = 0; i<A/4; i++) {
			temp += "long ";
		}
		
		System.out.println(temp+"int");
		
		sc.close();
	}
}