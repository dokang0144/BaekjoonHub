import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	
    	String s = sc.nextLine();
    	int count = 0;
    	
    	for(int i=0; i<s.length(); i++) {
    		
    		char ch = s.charAt(i);
    		
    		if(ch == 'c' ) {
    			if(i < s.length() - 1) {
        			if(s.charAt(i+1) == '=') {
        				i++;
        			} else if(s.charAt(i+1) == '-') {
        				i++;
        			}	
    			}
    		} else if(ch == 'd') {
    			if(i < s.length() - 1) {
        			if(s.charAt(i+1) == 'z') {
        				if(i < s.length() - 2) {
            				if(s.charAt(i+2) == '=') {
            					i++;
            					i++;
            				}
        				}
        			} else if(s.charAt(i+1) == '-') {
        				i++;
        			}
    			}
    		} else if(ch == 'l') {
    			if(i < s.length() - 1) {
        			if(s.charAt(i+1) == 'j') {
        				i++;
        			}
    			}

    		} else if(ch == 'n') {
    			if(i < s.length() - 1) {
        			if(s.charAt(i+1) == 'j') {
        				i++;
        			}
    			}
    		} else if(ch == 's') {
    			if(i < s.length() - 1) {
        			if(s.charAt(i+1) == '=') {
        				i++;
        			}
    			}
    		} else if(ch == 'z') {
    			if(i < s.length() - 1) {
        			if(s.charAt(i+1) == '=') {
        				i++;
        			}
    			}
    		}
    		
    		count++;
    	}
    	
    	System.out.println(count);
    }
}