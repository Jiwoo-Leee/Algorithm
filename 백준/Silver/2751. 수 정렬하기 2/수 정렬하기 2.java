import java.io.*;
import java.util.*;

public class Main {

    // 힙 정렬 메서드
    public static void heapSort(ArrayList<Integer> A) {
        int n = A.size();
        
        // 힙 생성
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(A, n, i);
        }

        // 힙에서 원소 제거 및 정렬
        for (int i = n - 1; i > 0; i--) {
            swap(A, 0, i); // 현재 최대값을 배열의 끝으로 이동
            heapify(A, i, 0); // 힙 재구성
        }
    }

    // 힙을 만드는 메서드
    public static void heapify(ArrayList<Integer> A, int n, int i) {
        int largest = i; // 루트
        int left = 2 * i + 1; // 왼쪽 자식
        int right = 2 * i + 2; // 오른쪽 자식

        // 왼쪽 자식이 루트보다 큰 경우
        if (left < n && A.get(left) > A.get(largest)) {
            largest = left;
        }

        // 오른쪽 자식이 지금까지의 가장 큰 값보다 큰 경우
        if (right < n && A.get(right) > A.get(largest)) {
            largest = right;
        }

        // 가장 큰 값이 루트가 아니면 스왑하고 재귀적으로 힙 구조를 재구성
        if (largest != i) {
            swap(A, i, largest);
            heapify(A, n, largest);
        }
    }

    // 두 원소를 교환하는 메서드
    public static void swap(ArrayList<Integer> A, int i, int j) {
        int temp = A.get(i);
        A.set(i, A.get(j));
        A.set(j, temp);
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        ArrayList<Integer> array = new ArrayList<>();
        
        for (int i = 0; i < a; i++) {
            array.add(Integer.parseInt(reader.readLine()));
        }
        
        // 힙 정렬 호출
        heapSort(array);
        
        // 정렬된 배열 출력
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<a;i++) {
        	sb.append(array.get(i) +"\n");
        }
        
        System.out.println(sb.toString().trim());
    }
}
