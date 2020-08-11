class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<Integer>();
        if(matrix.length == 0 || matrix[0].length==0){
            return ans;
        }
        int up = 0, down = matrix.length - 1, left = 0, right = matrix[0].length -1;
        while(left <= right && up <= down){
            for(int i = left; i <= right; i++){
                ans.add(matrix[up][i]);
            }                        
            for(int i = up+1; i <= down; i++){
                ans.add(matrix[i][right]);
            }            
            
            if(left < right && up < down){
                for(int i = right - 1; i > left; i--){
                    ans.add(matrix[down][i]);
                }                            
                for(int i = down; i > up; i--){
                    ans.add(matrix[i][left]);
                }                                
            }
            up++;
            right--;
            down--;
            left++;
            
        }
        
        return ans;
        
    }
}
