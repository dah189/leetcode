class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = {-1, -1};
        if(nums == null || nums.length == 0){
            return ans;
        }
        
        int low = 0;
        int high = nums.length -1;
        
        //to find start index
        while(low <= high){
            int mid = low + ((high - low) >> 1);
            if(target <= nums[mid]){
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        if(low < nums.length && nums[low] == target){
            ans[0] = low;
        }
        
        
        low = 0;
        high = nums.length -1;
        
        //to find end index
        while(low <= high){
            int mid = low + ((high - low) >> 1);
            if(target < nums[mid]){
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        if(high >= 0 && nums[high] == target){
            ans[1] = high;
        }
        
        return ans;
    }
    
}
