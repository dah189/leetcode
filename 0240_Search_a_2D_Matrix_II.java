class Solution {
    public boolean searchMatrix(int[][] mat, int target) {
        if(mat == null) return false;
        
        int row = mat.length - 1, col = 0;
        while(row >= 0 && col < mat[0].length){
            if(mat[row][col] > target){
                row--;
            }else if(mat[row][col] < target){
                col++;
            }else{
                return true;
            }
        }
        return false;
    }
}
