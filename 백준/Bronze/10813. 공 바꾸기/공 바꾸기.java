import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	
    	int N = sc.nextInt();
    	int[] arr = new int[N];
    	int M = sc.nextInt();
    	
    	for (int x = 0; x < N; x++) {
    		arr[x] = x+1;
    	}
    	
    	for (int y = 0; y < M; y++) {
    		int i = sc.nextInt() - 1;
    		int j = sc.nextInt() - 1;
    		int temp = 0;
    		
    		temp = arr[i];
    		arr[i] = arr[j];
    		arr[j] = temp;
    	}
    	
    	for (int z = 0; z < arr.length; z++) {
    		System.out.printf("%s ", arr[z]);
    	}
    	
    	sc.close();
    }
}