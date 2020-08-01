class Solution {
    public void nextPermutation(int[] nums) {
                
        int i = nums.length-1;
        
        while(i > 0 && nums[i] <= nums[i-1]){
            i--;
        }
        
        int j = nums.length-1;
        if(i != 0){
            i--;            
            while(j > i && nums[j] <= nums[i]){
                j--;
            }
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
        }
        
        
        j = nums.length-1;
        while(i < j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }
}
