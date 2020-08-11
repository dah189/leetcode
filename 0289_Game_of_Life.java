class Solution {
    public void gameOfLife(int[][] board) {
        if(board.length!=0 && board[0].length!=0){
              
            int row = board.length;
            int column = board[0].length;
            
            for(int i = 0; i < row; i++){//the first iteration to record every cell's neighbor
                for(int j = 0; j < column; j++){
                    int count = countLives(board, i, j);
                    board[i][j] = count;
                }
            }
                    
            for(int i = 0; i < row; i++){//the second iteration to get answer
                for(int j = 0; j < column; j++){
                    if(board[i][j] == -3){//dead cell with three alive
                        board[i][j] = 1;
                    }else if(board[i][j] <= 0){//dead cell
                        board[i][j] = 0;
                    }else if(0 < board[i][j] && board[i][j] != 3 && board[i][j] != 4){//alive cell with 2 or 3 alive
                        board[i][j] = 0;
                    }else{//other alive cell
                        board[i][j] = 1;
                    }
                }
            }
        }
    }
    
    public int countLives(int[][] board, int row, int column){//this method used to record alive neightbor count of every cell
        int count = 0;
        for(int i = column - 1; i <= column + 1; i++){
            for(int j = row - 1; j <= row + 1; j++){
                try{
                    if(board[j][i] > 0){
                        count++;//positive number means this cell was alive. the count of neighbor alive should be subtracted 1,because itself also was counted.
                    }
                }catch(IndexOutOfBoundsException e){
                    //catch the error that the cell on the edge causes
                }
            }
        }
        count = (board[row][column] == 1)? count: -count;//non-positive number means this cell was dead
        return count;
        
    }
}
