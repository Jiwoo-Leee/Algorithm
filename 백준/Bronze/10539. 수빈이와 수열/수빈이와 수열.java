import java.util.*;
public class Main {
	public static void main(String[] args) {		
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int[] b = new int[num];
		int sum = 0;
		for(int i=0;i<num;i++) {
			b[i] = scanner.nextInt();
		}
		int[] newb = new int[num];
		for(int i=0;i<num;i++) {
			if(i==0) {
				newb[0] = b[0];
			}
			newb[i] = b[i]*(i+1)-sum;
			sum += newb[i];
			System.out.print(newb[i]+" ");
		}
	}
}