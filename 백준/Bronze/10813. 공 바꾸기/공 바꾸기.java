import java.util.*;

public class Main {
    public static void main(String[] args){
    	Scanner scanner = new Scanner(System.in);
    	int N = scanner.nextInt();
    	int M = scanner.nextInt();
    	int array[] = new int[N];
    	int temp;
    	for(int k=0;k<N;k++) {
    		array[k] = k+1;
    	}
    	for(int k=0;k<M;k++) {
    		int i = scanner.nextInt();
    		int j = scanner.nextInt();
    		
    		temp = array[i-1];
    		array[i-1] = array[j-1];
    		array[j-1] = temp;
    	}
    	for(int i=0;i<array.length;i++) {
    		System.out.print(array[i]+" ");
    	}
    	scanner.close();
    }
} 