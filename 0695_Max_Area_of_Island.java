class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        if(grid == null){
            return 0;
        }
        
        int ans = 0;
        
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(grid[i][j] == 1){
                    ans = Math.max(ans, dps(grid, i, j));
                }
                
            }
        }
        
        return ans;
    }
    
    public int dps(int[][] grid, int r, int c){
        int area = 0;
        if(r < 0 || r == grid.length || c < 0 || c == grid[0].length || grid[r][c] != 1){
            return area;
        }       
        grid[r][c] = 2;
        area++;
        
        area += dps(grid, r-1, c);
        area += dps(grid, r+1, c);
        area += dps(grid, r, c-1);
        area += dps(grid, r, c+1);
        
        return area;
    }
}
