class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        String new_string = my_string.substring(0,s);
        String new_string2 = new_string + overwrite_string;
        
        if (answer.length() < my_string.length()){
            String plus_string = my_string.substring(new_string2.length(),my_string.length());
            answer = new_string2 + plus_string;
            return answer;
        }
        else{
            answer = new_string2;
            return answer;
        }
        
    }
}