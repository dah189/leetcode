class Solution {
    public int maxArea(int[] height) {
        int right = height.length - 1;
        int left = 0;
        int water = 0;
        while(left < right){            
            
            water = Math.max(water,Math.min(height[right], height[left]) * (right - left));   
            
            if(height[left] < height[right]){                
                left++;
            }else{
                right--;
            }
        }
        
        return water;
    }
}
