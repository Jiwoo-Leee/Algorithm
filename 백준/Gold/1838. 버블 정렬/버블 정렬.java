import java.io.*;
import java.util.*;

public class Main {
    static class Numset implements Comparable<Numset>{
    	int index;
    	long value;
    	
    	public Numset(long val,int idx) {
    		index = idx;
    		value = val;
    	}
    	public int compareTo(Numset o) {
          return (int) (this.value - o.value);
    	}
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());     
        int[] arrayA = new int[a];
        int max=0;
        PriorityQueue<Numset> pq = new PriorityQueue<Numset>();
        int flag = 0, temp = 0,i = 0;
        st = new StringTokenizer(br.readLine());
        for (i = 0; i < a; i++) {
            arrayA[i] = Integer.parseInt(st.nextToken());
            pq.add(new Numset( arrayA[i],i));
        }
        
        int idx = 0;
        while(!pq.isEmpty()) {
	         Numset nset = pq.poll();
	
	         if(max < nset.index - idx)
	             max = nset.index - idx;
	
	         idx++;
	    }
        System.out.println(max);

       
    }
}
