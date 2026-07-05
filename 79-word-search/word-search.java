class Solution {
    public boolean exist(char[][] board, String word) {
        for(int i=0;i<board.length;i++)
        {
            for(int j=0;j<board[0].length;j++)
            {
                if(board[i][j]==word.charAt(0))
                {
                    Boolean flag=f(0,i,j,board,word,"");
                    if(flag==true)
                    return true;
                }
            }
        }
        return false;
    }

    public boolean f(int size, int i, int j, char [][]board,String word,String ans)
    {
        if(size==word.length()) return true;
        if(i<0 || j<0 || i>=board.length ||j>=board[0].length || board[i][j]!=word.charAt(size))
        return false;
        char ch=board[i][j];
        board[i][j]='*';
        Boolean f1=f(size+1,i,j-1,board,word,ans+word.charAt(size));
        Boolean f2=f(size+1,i,j+1,board,word,ans+word.charAt(size));
        Boolean f3=f(size+1,i+1,j,board,word,ans+word.charAt(size));
        Boolean f4=f(size+1,i-1,j,board,word,ans+word.charAt(size));
        board[i][j]=ch;
        return f1||f2||f3||f4;
    }
}