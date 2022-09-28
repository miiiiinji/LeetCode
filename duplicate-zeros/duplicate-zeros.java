class Solution {
    public void duplicateZeros(int[] arr) {
        
        int[] answer = new int[arr.length];
        int j = 0;
        
        for(int i=0;j<arr.length;i++){//길이만큼만 돌아가도록->out of bounce error
            if(arr[i]==0){
                answer[j] = 0;
                j++;
                if(j==arr.length)
                    break;
                answer[j] = 0;
                j++;
            }else{
                answer[j] = arr[i];
                j++;
            }
        } 
        
        for(int k =0;k<arr.length;k++){
            arr[k] = answer[k];
        }
    }
}