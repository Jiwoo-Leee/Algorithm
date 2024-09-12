import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        String letter = scanner.next();
        String[] Arr = letter.split("");
        String result = "";
        String[] result2 = new String[Arr.length];
        for (int i = 0; i < Arr.length; i++) {
            for (int j = i; j < Arr.length; j++) {
                result += Arr[j];  
            }
            result2[i] = result;
            result = ""; 
        }
        Arrays.sort(result2);
        for(int i=0;i<result2.length;i++) {
        	System.out.println(result2[i]);
        }
	}
}