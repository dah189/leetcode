class Solution {
    public int maxProduct(int[] nums) {
        if(nums == null || nums.length == 0){
            return 0;
        }
        
        int product = 1;
        int[] products = new int[nums.length];
        int max = nums[0];
        
        
        for(int i = 0; i < nums.length; i++){ //first iteration to record products of subarray
            if(nums[i] == 0){
                max = Math.max(max, 0);
                products[i] = 0;
                product = 1;
                continue;
            }
            
            product *= nums[i];
            products[i] = product;
            max = Math.max(max, product);
        }
        
        int maxAbs = products[nums.length-1];
        for(int i = nums.length -1; i >= 0; i--){ // second run to find max subarray         
            
            if(i != 0 && products[i] == 0){
                maxAbs = products[i-1];
                if(maxAbs < 0){// otherwise, maxAbs will divide itself in next loop
                    i--;
                }
            }else if(products[i] < 0 && maxAbs < 0){
                if(i != nums.length - 1){// when i == nums.length-1, it will divide itself
                    max = Math.max(max, maxAbs / products[i]); // a negetive subarray could be divide with a negetive subarray 
                                                               // to get a positive value
                }
                
            }
        }
        
        return max;
    }
}
