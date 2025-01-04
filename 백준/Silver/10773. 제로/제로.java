import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	
    	ArrayList<Integer> list = new ArrayList<>();
    	int result = 0;
    	int num = Integer.parseInt(br.readLine());
    	
    	for (int i = 0; i < num; i++) {
    		int value = Integer.parseInt(br.readLine());
            if(value==0 && !list.isEmpty()) {
            	list.remove(list.size()-1);
            }
            else if(value != 0) {
            	list.add(value);
            }
        }
    	
    	for(int i=0;i<list.size();i++) {
    		result += list.get(i);
    	}
    	
    	System.out.println(result);
    }
} 