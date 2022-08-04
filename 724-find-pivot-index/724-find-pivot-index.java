class Solution {
    public int pivotIndex(int[] nums) {
        int len = nums.length;
        int[] left = new int[len];
        left[0] = 0;
        
        for(int i=1 ; i<len ; i++){
            left[i] = left[i-1] + nums[i-1];
        }
        
        int[] right = new int[len];
        right[len-1] = 0;
        
        for(int i=len-2 ; i>=0 ; i--){
            right[i] = right[i+1] + nums[i+1];
        }

        for(int i=0 ; i<len ; i++){
            if(left[i] == right[i]){
                return i;
            }
        }
        
        return -1;
    }
}