class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        for(int layer= 0; layer < n/2; layer++){
            int up = layer;
            int down = n - 1 - layer;
            for(int i = up; i < down; i++){
                int pos1 = i;
                int pos2 = n-1-i;
                int temp = matrix[up][pos1];
                
                matrix[up][pos1]= matrix[pos2][up];
                matrix[pos2][up] = matrix[down][pos2];
                matrix[down][pos2] = matrix[pos1][down];
                matrix[pos1][down] = temp;                
            }
        }
        
    }
}
