class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i=0;i<board.length;i++)
        {
            boolean []col=new boolean[board.length+1];
            for(int j=0;j<board[0].length;j++)
            {
                if(board[i][j]=='.') continue;
                if(col[board[i][j]-'0']==true) return false;
                col[board[i][j]-'0']=true;
            }
        }

        for(int i=0;i<board[0].length;i++)
        {
            boolean row[]=new boolean[board[0].length+1];
            for(int j=0;j<board.length;j++)
            {
                if(board[j][i]=='.') continue;
                if(row[board[j][i]-'0']==true) return false;
                row[board[j][i]-'0']=true;
            }
        }

        for(int i=0;i<9;i+=3)
        {
            for(int j=0;j<9;j+=3)
            {
                boolean []row=new boolean[10];
                for(int k=i;k<i+3;k++)
                {
                    for(int l=j;l<j+3;l++)
                    {
                        if(board[k][l]=='.') continue;
                        if(row[board[k][l]-'0']==true) return false;
                        row[board[k][l]-'0']=true;
                    }
                }
            }
        }
        return true;
    }
}