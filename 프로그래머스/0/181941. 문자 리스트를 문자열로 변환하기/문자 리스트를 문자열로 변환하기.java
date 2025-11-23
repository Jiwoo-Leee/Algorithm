class Solution {
    public String solution(String[] arr) {
        StringBuilder sb = new StringBuilder();
        String answer = "";
        for(int i=0;i<arr.length;i++){
            sb.append(arr[i]);
        }
        answer = sb.toString();
        return answer;
    }
}