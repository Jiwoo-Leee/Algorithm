import java.util.*;
public class Main {
	public static void main(String[] args) {		
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int bonus = 0, score = 0;
		String ss = scanner.next();
		char[] s = ss.toCharArray();
		int result = 0;
		for(int i=0;i<n;i++) {
			if(s[i]=='O') {
				score += (i+1) + bonus;
				bonus++;
			}
			else {
				bonus = 0;
			}
		
		}
		System.out.println(score);	
	}
}