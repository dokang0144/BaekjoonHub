import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	
    public static void main(String[] args) {
    	
    	int count = 0;
    	int N = sc.nextInt();
    	
    	for(int i=0; i<N; i++) {
    		if (check() == true) {
    			count++;
    		}
    	}
    	
    	System.out.println(count);
    }
    
    public static boolean check() {
    	boolean[] check = new boolean[26];
    	int prev = 0;
    	String s = sc.next();
    	
    	for(int i=0; i<s.length(); i++) {
    		int now = s.charAt(i); // i 번째 문자 (현재 문자)
    		
    		if(prev != now) { // 앞에 문자와 i 번째 문자가 다르면
    			if (check[now - 'a'] == false) {
    				check[now - 'a'] = true;
    				prev = now;
    			} else { // 해당 문자가 이미 나온 적이 있는 경우 (그룹단어가 아님)
    				return false; // 함수 종료
    			}
    		} else { // 앞에 문자와 i 번째 문자가 같다면? (연속된 문자)
    			continue;
    		}
    	}
    	return true;
    }
}