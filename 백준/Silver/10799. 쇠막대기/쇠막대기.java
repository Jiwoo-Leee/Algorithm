import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String a = scanner.next();
		int stickcnt=0,piececnt=0;
		char[] chararray = a.toCharArray();
		for(int i=0;i<chararray.length-1;i++) {
			if(chararray[i]=='(') {
				if(chararray[i+1]=='(') {
					stickcnt++;
				}
				else if(chararray[i+1]==')') {
					piececnt += stickcnt;
				}
			}
			else if(chararray[i]==')') {
				if(chararray[i+1]==')') {
					stickcnt--;
					piececnt++;
				}
			}
			
		}
		System.out.println(piececnt);

	}
}