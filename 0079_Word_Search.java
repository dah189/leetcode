class Solution {
    public boolean exist(char[][] board, String word) {
        if(board == null) return false;
        char[] words = word.toCharArray();
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length; j++){
                boolean ans = dfs(board, words, 0, i, j);
                if(ans) return true;
            }
        } 
        return false;
    }

    public boolean dfs(char[][] board, char[] word, int index, int row, int col){ 
        if(row < 0 || col < 0 || row >= board.length || col >= board[0].length || board[row][col] != word[index]) return false;  
        if(index == word.length - 1) return true;
        
        board[row][col] = '#';       
        boolean ans = false;
        int[] coefrow = {1, 0, -1, 0};
        int[] coefcol = {0, 1, 0, -1};
        
        for(int i = 0; i < 4; i++){
            ans = dfs(board, word, index + 1, row + coefrow[i], col + coefcol[i]);
            if(ans) break;
        }
        
        board[row][col] = word[index];
        return ans;
    }
    
}
