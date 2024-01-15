import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	
    	int[] arr = new int[8];
    	
    	for(int i=0; i<8; i++) {
    		arr[i] = sc.nextInt();
    	}
    	
    	int chk1 = 0;
    	int chk2 = 0;
    	
    	for(int j=0; j<8; j++) {
    		if(arr[j] == j+1) {
    			chk1++;
    		}
    	}
    	
    	for(int k=0; k<8; k++) {
    		if(arr[k] == 8-k) {
    			chk2++;
    		}
    	}
    	
    	if(chk1 == 8) {
    		System.out.println("ascending");
    	} else if(chk2 == 8) {
    		System.out.println("descending");
    	} else {
    		System.out.println("mixed");
    	}
    }
}