import java.io.*;
import java.util.*;

public class Main {
	static int cnt=0;
	static int k = 0;
	public static void quick_sort(int[] A,int p,int r) {
		if(p < r) {
			int q = partition(A, p, r);
			quick_sort(A,p,q-1);
			quick_sort(A,q+1,r);
		}
	}
	
	public static int partition(int[] A, int p,int r) {
		int x = A[r];
		int i = p - 1;
		for(int j=p;j<=r-1;j++) {
			if(A[j] <= x) {
				i++;
				swap(A, i, j);
			}
		}
		if(i+1 !=r) {
			swap(A,i+1,r);
		}
		return i+1;
	}
	
	public static void swap(int[] A, int i, int j) {
		int temp = A[i];
		A[i] = A[j];
		A[j] = temp;
		cnt++;
		if(cnt == k) {
			System.out.print(A[i] >= A[j] ? A[j]+" "+A[i] : A[i]+" "+A[j]);
		}
	}
	
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());
        int[] array = new int[a];
        String[] input = br.readLine().split(" ");       
        for (int i = 0; i < a; i++) {
            array[i] = Integer.parseInt(input[i]);
        }
        quick_sort(array,0,a-1);
        if(cnt<k) {
        	System.out.print("-1");
        }
    }
}
