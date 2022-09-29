class Solution {
    public boolean checkIfExist(int[] arr) {
        
        boolean answer = false;
   
        for(int i=0;i<arr.length;i++){ //edge case, i and j cannot be the same element...
            for(int j=i+1;j<arr.length;j++){
                if(2*arr[i]==arr[j]||arr[i]==2*arr[j]){
                    answer = true;
                    break;
                }         
            }
        
        }
        return answer;
    }
}