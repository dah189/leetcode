class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> prex = new HashMap<Integer, Integer>();
        prex.put(0,1);
        int sum = 0;
        int count = 0;
        
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
            
            if(prex.containsKey(sum - k)){
                count += prex.get(sum - k);
            }
            
            prex.put(sum, prex.getOrDefault(sum, 0) + 1);
            
        }
        
        return count;
    }
}
