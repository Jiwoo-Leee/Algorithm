import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Map<Character, Integer> alphabetToStrokes = new HashMap<>();
        char[] alphabets = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 
                            'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        int[] strokes = {3, 2, 1, 2, 4, 3, 1, 3, 1, 1, 3, 1, 3, 2, 1, 2, 2, 2, 1, 2, 1, 1, 1, 2, 2, 1};
        for (int i = 0; i < alphabets.length; i++) {
            alphabetToStrokes.put(alphabets[i], strokes[i]);
        }
        int temp;
        int temp2;
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		String a = scanner.next();
		String b = scanner.next();
		ArrayList<Integer> list = new ArrayList<>();
		ArrayList<Integer> pluslist = new ArrayList<>();
		int minLength = Math.min(a.length(), b.length());
        
        for (int i = 0; i < minLength; i++) {
            temp = alphabetToStrokes.get(a.charAt(i));
            list.add(temp);
            temp2 = alphabetToStrokes.get(b.charAt(i));
            list.add(temp2);
        }
        
        if (a.length() > b.length()) {
            for (int i = minLength; i < a.length(); i++) {
                temp = alphabetToStrokes.get(a.charAt(i));
                list.add(temp);
            }
        } else if (b.length() > a.length()) {
            for (int i = minLength; i < b.length(); i++) {
                temp2 = alphabetToStrokes.get(b.charAt(i));
                list.add(temp2);
            }
        }
        while (list.size() > 2) {
            ArrayList<Integer> nextList = new ArrayList<>();
            for (int i = 0; i < list.size() - 1; i++) {
                nextList.add((list.get(i) + list.get(i + 1)) % 10);  
            }
            list = nextList; 
        }

        int result = list.get(0) * 10 + list.get(1);  
        System.out.println(result + "%");
    }
	
}