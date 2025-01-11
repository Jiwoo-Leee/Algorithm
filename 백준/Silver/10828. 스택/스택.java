import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Stack<Integer> stack = new Stack<>();
        int num = Integer.parseInt(br.readLine());
        int last;
        for (int i = 0; i < num; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String order = st.nextToken();
            if(order.equals("push")){
                last = Integer.parseInt(st.nextToken());
                stack.add(last);
            }

            else if(order.equals("pop")){
                if(stack.isEmpty()){
                    System.out.println("-1");
                }
                else{
                    System.out.println(stack.pop());
                }
            }

            else if(order.equals("size")){
                System.out.println(stack.size());
            }

            else if(order.equals("empty")){
                if(stack.isEmpty()){
                    System.out.println("1");
                }
                else{
                    System.out.println("0");
                }
            }

            else if(order.equals("top")){
                if(stack.isEmpty()){
                    System.out.println("-1");
                }
                else{
                    System.out.println(stack.peek());
                }
            }
            
        }
    }
}