import java.util.*;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	StringTokenizer st;
	    double SumTotal = 0;
    	double SumScore = 0;
    	
    	for(int i=0; i < 20; i++) {
    		st = new StringTokenizer(sc.nextLine());
    		String sub = st.nextToken();
    		double score = Double.parseDouble(st.nextToken());
    		String grade = st.nextToken();	
    		double total = 0;
    		
    		if(!grade.equals("P")) {
        		switch (grade) {
	    			case "A+":
	    				total = 4.5;
	    				break;
	    			case "A0":
	    				total = 4.0;
	    				break;
	    			case "B+":
	    				total = 3.5;
	    				break;
	    			case "B0":
	    				total = 3.0;
	    				break;
	    			case "C+":
	    				total = 2.5;
	    				break;
	    			case "C0":
	    				total = 2.0;
	    				break;
	    			case "D+":
	    				total = 1.5;
	    				break;
	    			case "D0":
	    				total = 1.0;
	    				break;
	    			case "F":
	    				total = 0.0;
	    				break;
        		}
                SumTotal += (score*total);
    		    SumScore += score;
    		}
    	}
    	System.out.printf("%.6f",SumTotal/SumScore);
    }
}