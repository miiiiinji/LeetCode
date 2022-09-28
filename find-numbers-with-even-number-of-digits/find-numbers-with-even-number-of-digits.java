import java.lang.Math.*;

class Solution {
    public int findNumbers(int[] nums) {
        
        int answer = 0;
        int digit = 0;
        
        for(int one:nums){
            
            digit = (int)(Math.log10(one)+1);
            
            if(digit%2==0){
                answer++;
            }
        }
        
        return answer;
        
    }
}