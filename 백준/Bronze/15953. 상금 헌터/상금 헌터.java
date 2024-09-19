import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		long a,b;
		long aprize=0, bprize=0;
		for(int i=0;i<t;i++) {
			a = scanner.nextLong();
			b = scanner.nextLong();
			if(a==0) {
				aprize = 0;
			}
			else if(a==1) {
				aprize = 5000000;
			}
			else if(a<=3) {
				aprize = 3000000;
			}
			else if(a<=6) {
				aprize = 2000000;
			}
			else if(a<=10) {
				aprize = 500000;
			}
			else if(a<=15) {
				aprize = 300000;
			}
			else if(a<=21) {
				aprize = 100000;
			}
			else {
				aprize = 0;
			}
			if(b==0) {
				bprize = 0;
			}
			else if(b==1) {
				bprize = 5120000;
			}
			else if(b<=3) {
				bprize = 2560000;
			}
			else if(b<=7) {
				bprize = 1280000;
			}
			else if(b<=15) {
				bprize = 640000;
			}
			else if(b<=31) {
				bprize = 320000;
			}
			else {
				bprize = 0;
			}
			System.out.println(aprize+bprize);
		}
	}
}