import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    
    	int N = sc.nextInt(); 
    	int[] arr = new int[N];
    	
    	for (int i = 0; i < arr.length; i++) {
    		arr[i] = sc.nextInt();
    	}
    	
    	int max = arr[0];
    	int min = arr[0];
    	
    	for (int j = 0; j < arr.length; j++) {
    		if (arr[j] > max) {
    			max = arr[j];
    		} else if (arr[j] < min) {
    			min = arr[j];
    		}
    	}
    	
    	System.out.printf("%s %s", min, max);
    	
    	sc.close();
    }
}