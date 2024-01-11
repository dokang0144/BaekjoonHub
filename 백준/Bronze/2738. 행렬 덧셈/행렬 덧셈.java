import java.util.*;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	
    	int A = sc.nextInt();
    	int B = sc.nextInt();
    	
    	int[][] arr = new int[A][B];
    	
    	for(int i=0; i<A; i++) {
    		for(int j=0; j<B; j++) {
    			arr[i][j] = sc.nextInt();
    		}
    	}
    	
    	for(int i=0; i<A; i++) {
    		for(int j=0; j<B; j++) {
    			arr[i][j] += sc.nextInt();
    		}
    	}
    	
    	for(int i=0; i<A; i++) {
    		for(int j=0; j<B; j++) {
    			System.out.printf("%s ",arr[i][j]);
    		}
    		System.out.println();
    	}
    }
}