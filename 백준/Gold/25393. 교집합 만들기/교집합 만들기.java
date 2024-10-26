import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main {
    HashMap<Integer, TreeSet<Integer>> left = new HashMap<>();
    HashMap<Integer, TreeSet<Integer>> right = new HashMap<>();

    private int getAnswer(int l, int r) {
    	// 리스트 중에 l,r 값이 둘 다 일치하지 앟는 항목이 없으면 교집합 조건이 안됨
        // l,r이 정확히 일치해야하는 조건 때문에 일치하지 않으면 -1 출력
        if (!left.containsKey(l) || !right.containsKey(r))    
        	return -1;
        // l값의 범위 검사, l부터 시작하는 구간 리스트 value 중 l보다 큰 값 중에 가장 작은 값(같은값 포함)
        // r값보다 큰 범위를 포함하는지 체크하기 위함
        Integer tmp = left.get(l).ceiling(r); 
        if (tmp == null) // r 범위가 유효하지 않기 때문에 교집합이 성립 안됨
            return -1;
        else if (tmp == r) // r값이 일치하므로 범위가 질의 구간과 일치 
            return 1;
        
        // r값의 범위 검사, r부터 시작하는 구간 리스트 value 중 r보다 작은 값 중에 가장 큰 값(같은값 포함) 
        // l값보다 작은 범위를 포함하는지 체크하기 위함
        tmp = right.get(r).floor(l); 
        if (tmp == null)  // l 범위가 유효하지 않기 때문에 교집합이 성립 안됨
            return -1;
        // l 범위 r 범위를 포함하는 구간 두개가 존재하므로 그 최소 개수 출력
        return 2;
    }

    private void solution() throws Exception {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;

        // while 문을 for 문으로 변환
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int l = Integer.parseInt(st.nextToken());
            int r = Integer.parseInt(st.nextToken());

            if (!left.containsKey(l))
                left.put(l, new TreeSet<>());
            left.get(l).add(r);

            if (!right.containsKey(r))
                right.put(r, new TreeSet<>());
            right.get(r).add(l);
        }

        int q = Integer.parseInt(br.readLine());
        StringBuilder answer = new StringBuilder();
        
        // 쿼리 처리 부분도 while 문을 for 문으로 변환
        for (int i = 0; i < q; i++) {
            st = new StringTokenizer(br.readLine());
            int l = Integer.parseInt(st.nextToken());
            int r = Integer.parseInt(st.nextToken());
            answer.append(getAnswer(l, r)).append('\n');
        }

        System.out.print(answer);
    }
    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}