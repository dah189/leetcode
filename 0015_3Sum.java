class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        if(nums.length < 3){
            return ans;
        }
        Arrays.sort(nums);
        int target = 0;
        for(int first = 0; first < nums.length - 1 && nums[first] <=0 ; first++){
            
            target =  -nums[first];
            int third = nums.length - 1;
            int second = first + 1;
            while(second < third){
                if(nums[second]+nums[third] > target || (third < nums.length -1 && nums[third] == nums[third + 1])){
                    third--;
                }else if(nums[second]+nums[third] < target || (second > first + 1 && nums[second] == nums[second - 1])){
                    second++;
                }else{
                    List<Integer> list = new ArrayList<Integer>();
                    list.add(nums[first]);
                    list.add(nums[second]);
                    list.add(nums[third]);
                    ans.add(list);
                    third--;
                    second++;
                }
            }
            
            while(first < nums.length-1 && nums[first] == nums[first+1]){
                first++;
            }
            
        }
        return ans;
    }
}
