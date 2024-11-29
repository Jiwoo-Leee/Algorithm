import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        PriorityQueue<Integer> positiveQueue = new PriorityQueue<>(Collections.reverseOrder()); // 내림차순
        PriorityQueue<Integer> negativeQueue = new PriorityQueue<>(); // 오름차순
        int zeroCount = 0;
        int oneCount = 0; // 1은 묶지 않고 바로 더하는 것이 이득

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            // 첫째 줄: 수열의 크기 N 읽기
            int N = Integer.parseInt(br.readLine());

            // 둘째 줄부터 N개의 줄: 수열 읽기 및 처리
            for (int i = 0; i < N; i++) {
                int num = Integer.parseInt(br.readLine());
                if (num > 1) {
                    positiveQueue.add(num); // 양수 중 1보다 큰 값만 큐에 저장
                } else if (num < 0) {
                    negativeQueue.add(num); // 음수는 오름차순으로 저장
                } else if (num == 0) {
                    zeroCount++; // 0의 개수 카운트
                } else {
                    oneCount++; // 1은 바로 더할 값으로 처리
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        // 결과 계산
        int result = 0;

        // 양수 처리 (내림차순으로 묶어서 곱하기)
        while (positiveQueue.size() > 1) {
            int a = positiveQueue.poll();
            int b = positiveQueue.poll();
            result += a * b; // 두 양수를 곱해서 결과에 추가
        }
        if (!positiveQueue.isEmpty()) {
            result += positiveQueue.poll(); // 남은 값 더하기
        }

        // 음수 처리 (오름차순으로 묶어서 곱하기)
        while (negativeQueue.size() > 1) {
            int a = negativeQueue.poll();
            int b = negativeQueue.poll();
            result += a * b; // 두 음수를 곱해서 결과에 추가
        }
        if (!negativeQueue.isEmpty()) {
            if (zeroCount > 0) {
                // 남은 음수와 0을 묶어서 처리하지 않음
            } else {
                result += negativeQueue.poll(); // 음수가 남아 있고 0이 없으면 더하기
            }
        }

        // 1의 개수 더하기 (1은 곱하지 않고 더하기)
        result += oneCount;

        // 최종 결과 출력
        System.out.println(result);
    }
}
