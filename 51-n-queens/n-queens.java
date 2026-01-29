class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<String>ans=new ArrayList<>();
        List<List<String>>result=new ArrayList<>();
        char [][]board=new char[n][n];
        for(char []row:board)
        Arrays.fill(row,'.');
        nqueen(0,n,result,board);
        return result;
    }

    public void nqueen(int row,int n,List<List<String>>result,char [][]board)
    {
        if (row == n) {
            List<String> temp = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                temp.add(new String(board[i]));
            }
            result.add(temp);
            return;
        }

        for (int col = 0; col < n; col++) {
            if (place(row, col, n,board)) {
                board[row][col] = 'Q';
                nqueen(row + 1, n, result,board);
                board[row][col] = '.';   // backtrack
            }
        }
    }

    public boolean place(int row, int col, int n, char[][]board)
    {
        for(int k=0;k<row;k++)
        {
            if(board[k][col]=='Q')
            return false;
           
        }
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') return false;
        }

        // right diagonal
        for (int i = row - 1, j = col + 1; i >= 0 && j < n; i--, j++) {
            if (board[i][j] == 'Q') return false;
        }

    
         return true;
    }


}