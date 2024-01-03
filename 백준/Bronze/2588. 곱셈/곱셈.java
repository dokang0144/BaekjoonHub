import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		System.out.printf("%s\n", A*((B%100)%10));
		System.out.printf("%s\n", A*((B%100)/10));
		System.out.printf("%s\n", A*(B/100));
		System.out.printf("%s", A*B);
		
		sc.close();
	}
}