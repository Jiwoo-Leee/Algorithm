import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static Integer[] dp;
	
	static int calc(int N) {
		if(dp[N]==null) {
			if(N%6==0) {
				dp[N] = Math.min(calc(N-1), Math.min(calc(N/3), calc(N/2))) + 1;
			}
			else if(N%3==0) {
				dp[N] = Math.min(calc(N/3), calc(N-1)) + 1;
	    		
	    	}
	    	else if(N%2==0) {
	    		dp[N] = Math.min(calc(N/2), calc(N-1)) + 1;
	    		
	    	}
	    	else {
	    		dp[N] = calc(N-1) + 1;
	    	}
	    	
	    	
	        
		}
		return dp[N];
		
	}
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        dp = new Integer[N+1];
        dp[0] = dp[1] = 0;
        System.out.print(calc(N));
    }
}