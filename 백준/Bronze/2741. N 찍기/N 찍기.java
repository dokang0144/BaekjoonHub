import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	
    	int A = sc.nextInt();
    	int B = 1;
    	
    	for(int i=0; i<A; i++) {
    		System.out.println(B);
    		B++;
    	}
    }
}