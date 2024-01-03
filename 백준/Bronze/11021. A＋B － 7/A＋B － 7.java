import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	
    	int cnt = sc.nextInt();
    	int A = 0;
    	int B = 0;
    	
    	for(int i = 1; i <= cnt; i++) {
    		A = sc.nextInt();
    		B = sc.nextInt();
    		System.out.printf("Case #%s: %s\n", i, A+B);
    	}
    }
}