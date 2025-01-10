import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Queue<Integer> pq = new LinkedList<>();
        int num = Integer.parseInt(br.readLine());
        int cnt = 0;
        int last;
        for (int i = 0; i < num; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String order = st.nextToken();
            if(order.equals("push")){
                last = Integer.parseInt(st.nextToken());
                pq.add(last);
                cnt++;
            }

            else if(order.equals("pop")){
                if(pq.isEmpty()){
                    System.out.println("-1");
                }
                else{
                    System.out.println(pq.poll());
                    cnt--;
                }
            }

            else if(order.equals("size")){
                System.out.println(pq.size());
            }

            else if(order.equals("empty")){
                if(pq.isEmpty()){
                    System.out.println("1");
                }
                else{
                    System.out.println("0");
                }
            }

            else if(order.equals("front")){
                if(pq.isEmpty()){
                    System.out.println("-1");
                }
                else {
                    System.out.println(pq.peek());
                }
            }

            else if(order.equals("back")){
                if(pq.isEmpty()){
                    System.out.println("-1");
                }
                else{
                    for (int j : pq) {
                        cnt = j;
                    }
                    System.out.println(cnt);
                }
            }
        }
    }
}