import java.io.BufferedReader;
import java.util.*;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) throws Exception {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        // 노드별로 높이를 기록할 배열
        int[] length = new int[N];
        long cnt = 0;
        int tmp = 0;
//        TreeSet<HashMap<In>> Ptree = new TreeSet<>();
//
//        for (int i = 0; i < N; i++) {
//            int num = Integer.parseInt(br.readLine());
//            if(Ptree.higher(num)==null) {
//            	if(Ptree.lower(num)==null) {
//            		length[num] = 1;
//            	}
//            }
//            Ptree.add(num);
//        }
        
        TreeMap<Integer, Integer> Ptree = new TreeMap<>();
        for (int i = 0; i < N; i++) {
          int num = Integer.parseInt(br.readLine());
          if(Ptree.higherEntry(num)==null) {
        	  if(Ptree.lowerEntry(num)==null) {
        		  Ptree.put(num, 1);
        		//  length[num] = 1;
        	  }
        	  else {
        		  Ptree.put(num, Ptree.lowerEntry(num).getValue()+1);
        		 // length[num] = Ptree.lowerEntry(num).getValue()+1;
        	  }
          }
          else {
        	  if(Ptree.lowerEntry(num)==null) {
        		  Ptree.put(num, Ptree.higherEntry(num).getValue()+1);
        		//  length[num] = Ptree.higherEntry(num).getValue()+1;
        	  }
        	  else {
        		  tmp = Math.max(Ptree.lowerEntry(num).getValue()+1, Ptree.higherEntry(num).getValue()+1);
        		  Ptree.put(num, tmp);
        		//  length[num] = tmp;
        	  }
          }
         // cnt += length[num];
          //System.out.println(length[num]);
        }
        //System.out.println("----------------------");
        for(int value:Ptree.values()) {
        	cnt += value;
        	//System.out.println(value);
        }
        
        System.out.println(cnt);
    }
}