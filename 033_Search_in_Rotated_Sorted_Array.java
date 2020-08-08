class Solution {
    public int search(int[] nums, int target) {
        if(nums == null || nums.length==0){
            return -1;
        }
        int low = 0;
        int high = nums.length -1;
        int mid;
        
        while(low <= high){
            mid = low + (high - low) / 2; // avoid overflow
            if(nums[mid] == target){
                return mid;
            }
                        
            if(nums[low] <= nums[mid]){ // judge which part is sorted
                if(target < nums[mid] && target >= nums[low]){ // judge whether target in sorted part
                    high = mid - 1;
                }else{
                    low = mid + 1;
                }
            }else{
                if(target > nums[mid] && target <= nums[high]){
                    low = mid + 1;
                }else{
                    high = mid - 1;
                }
            }
        }
        
        return -1;
    }
}
