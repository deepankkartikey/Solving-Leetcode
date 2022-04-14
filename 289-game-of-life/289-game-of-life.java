class Solution {
    
    boolean isValidNeighbor(int x, int y, int[][] board){
        return (x>=0 && x<board.length && y>=0 && y<board[0].length);
    }
    
    public void gameOfLife(int[][] board) {
        // defining direction based on x and y co-ordinates
        int[] dx = {0,1,1,1,0,-1,-1,-1};
        int[] dy = {1,1,0,-1,-1,-1,0,1};
        
        // traverse grid and perform operations
        for(int r=0; r<board.length; r++){
            for(int c=0; c<board[0].length; c++){
                int live_neighbors = 0;
                for(int i=0; i<8; i++){
                    int curr_x = r+dx[i], curr_y = c+dy[i];
                    if(isValidNeighbor(curr_x, curr_y, board)
                      && Math.abs(board[curr_x][curr_y])==1)
                        live_neighbors++;
                }
                
                // make cell dead
                if(board[r][c]==1 && (live_neighbors<2 || live_neighbors>3))
                    board[r][c]=-1;
                
                // make cell live
                if(board[r][c]==0 && live_neighbors==3)
                    board[r][c]=2;
            }
        }
        
        for(int r=0; r<board.length; r++)
            for(int c=0; c<board[0].length; c++)
                if(board[r][c]>=1)
                    board[r][c]=1;
                else
                    board[r][c]=0;
    }
}