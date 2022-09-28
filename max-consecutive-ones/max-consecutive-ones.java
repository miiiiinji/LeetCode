class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        
        int maxconsecutiveones = 0;
        int answer = 0;
        int count = 0;
            
        for(int one:nums){
            
            if(one==1){
                count++;
                if(count>answer){
                    answer = count;                            
                    }   
            }else{
                count=0;
                        }

}
                                                                return answer;
    }
}