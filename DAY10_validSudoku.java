class Solution {
    public boolean isValid(char[][] board,int row , int col , char num)
    {
        //for row
        for(int j=0;j<9;j++)
        {
            if(board[row][j]==num)
            {
                return false;
            }
            
        }
        //for coloumn
        for(int i=0;i<9;i++)
        {
            if(board[col][i]==num)
            {
                return false;
            }
        }
        // for 3x3 grid
        int startingrow=row/3*3;
        int startingcol=col/3*3;
        for(int i=0;i<startingrow+3;i++)
        {
            for(int j=0;j<startingcol+3;j++)
            {
                if(board[i][j]==num)
                {
                    return false;
                }
            }
        }
        return true;
    }
    public boolean isValidSudoku(char[][] board) {

        //traversing into the 2D array
        for(int i=0;i<9;i++)
        {
            for(int j=0;j<9;j++)
            {
              if(board[i][j]=='.')
              continue;
                char num=board[i][j];    
                board[i][j]='.';

                if(isValid(board,i,j,num)==false )
                    return false;
                    board[i][j]=num;
                
            }
        }
        return true;
    }
}