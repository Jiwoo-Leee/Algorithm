import java.io.*;
import java.util.*;

public class Main { 
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int num = Integer.parseInt(br.readLine());

        int result = 0;

        for (int i = 0; i < num; i++) {
            int value = Integer.parseInt(br.readLine());
            pq.add(value);
        }

        for(int i = 0; i < num; i++){
            if(pq.size() < 2){
                break;
            }
            int num1 = pq.poll();
            int num2 = pq.poll();
            result += num1 + num2;
            pq.add(num1 + num2);
        }

        System.out.println(result);

    }
}