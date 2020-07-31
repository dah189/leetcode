class Solution {
    public int threeSumClosest(int[] nums, int target) {        
        int ans = nums[0]+nums[1]+nums[2];
        int n = nums.length;
        if(n == 3){
            return ans;
        }
        
        Arrays.sort(nums);
        
        for(int i = 0; i < n - 2; i++){
            int right = n -1;
            int left = i + 1;
            while(left < right){
                int sum = nums[i]+nums[left]+nums[right];
                if(Math.abs(ans - target) > Math.abs(sum-target)){
                    ans = sum;
                    if(ans == target){
                        return ans;
                    }
                }
                if(sum > target){                  
                    right--;
                }else{
                    left++;
                }
            }
        }
        return ans;
    }
}
