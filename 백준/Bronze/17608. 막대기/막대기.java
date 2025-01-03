import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	
    	int num = Integer.parseInt(br.readLine());
    	int[] stickLengths = new int[num];
    	int cnt = 1;
    	
    	 for (int i = 0; i < num; i++) {
             stickLengths[i] = Integer.parseInt(br.readLine());
         }
    	 int highest = stickLengths[num-1];
    	 for(int i=num-2;i>=0;i--) {
    		if(stickLengths[i]>highest) {
    			cnt++;
    			highest = stickLengths[i];
    		}
    	 }
    	 System.out.println(cnt);
    }
} 