import java.io.*;
import java.util.*;

public class Main {
    // 전역 변수 선언
    static int[] buildTimes; // 각 건물을 짓는 데 걸리는 시간
    static List<List<Integer>> graph; // 건물 간의 건설 순서를 저장하는 그래프 (인접 리스트)
    static int[] inDegree; // 각 건물의 진입 차수
    static int[] buildCost; // 각 건물을 짓는 데 필요한 총 시간 (동적 프로그래밍)
    static int W; // 목표로 건설해야 할 건물 번호
    static int N; // 건물의 개수
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // 첫 줄: 테스트케이스 개수
        int T = Integer.parseInt(br.readLine());
        
        for (int t = 0; t < T; t++) {
            // 첫째 줄: 건물의 개수 N, 건설 순서 규칙의 총 개수 K
            StringTokenizer st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());
            
            // 둘째 줄: 각 건물당 건설 시간 D1, D2, ..., DN
            buildTimes = new int[N + 1];
            st = new StringTokenizer(br.readLine());
            for (int i = 1; i <= N; i++) {
                buildTimes[i] = Integer.parseInt(st.nextToken());
            }
            
            // 그래프 및 진입 차수 배열 초기화
            graph = new ArrayList<>();
            for (int i = 0; i <= N; i++) {
                graph.add(new ArrayList<>());
            }
            inDegree = new int[N + 1];
            
            // 셋째 줄부터 K개의 건설 순서 X Y
            for (int i = 0; i < K; i++) {
                st = new StringTokenizer(br.readLine());
                int X = Integer.parseInt(st.nextToken());
                int Y = Integer.parseInt(st.nextToken());
                
                graph.get(X).add(Y); // 건설 순서 추가
                inDegree[Y]++; // 진입 차수 증가
            }
            
            // 마지막 줄: 목표로 해야 할 건물 번호 W
            W = Integer.parseInt(br.readLine());
            
            // 건설 비용 배열 초기화
            buildCost = new int[N + 1];
            
            // 위상 정렬 수행
            topologicalSort();
            
            // 결과 출력
            System.out.println(buildCost[W]);
        }
    }
    
    public static void topologicalSort() {
        Queue<Integer> q = new LinkedList<>();
        
        // 진입 차수가 0인 건물을 큐에 삽입하고 초기 비용 설정
        for (int i = 1; i <= N; i++) {
            if (inDegree[i] == 0) {
                buildCost[i] = buildTimes[i];
                q.offer(i);
            }
        }
        
        // 위상 정렬 수행
        while (!q.isEmpty()) {
            int current = q.poll();
            
            for (int next : graph.get(current)) {
                // 다음 건물의 최소 건설 시간 갱신
                buildCost[next] = Math.max(buildCost[next], buildCost[current] + buildTimes[next]);
                
                // 진입 차수 감소
                inDegree[next]--;
                
                // 진입 차수가 0이 되면 큐에 삽입
                if (inDegree[next] == 0) {
                    q.offer(next);
                }
            }
        }
    }
}
