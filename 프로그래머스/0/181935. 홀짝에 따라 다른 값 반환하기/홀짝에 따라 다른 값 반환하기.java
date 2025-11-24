class Solution {
    public int solution(int n) {
        int answer = 0;
        int sum = 0;
        int sum2 = 0;
        if(n%2==1){
            for(int i=1;i<n+1;i++){
                if(i%2==1){
                    sum += i;
                }
            }        
            return sum;    
        }
        else{
            for(int i=1;i<n+1;i++){
                if(i%2==0){
                    sum2 += (i*i);
                }
            }
            return sum2;
        }
        
    }
}