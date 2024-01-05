import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	
    	String N = sc.nextLine();
    	int count = 0;
    	int[] arr = {3,3,3,4,4,4,5,5,5,6,6,6,7,7,7,8,8,8,8,9,9,9,10,10,10,10};
    	
    	for (int i=0; i<N.length(); i++) {
    		count += arr[N.charAt(i)-'A'];
    	}
    	
    	System.out.println(count);
    }
}