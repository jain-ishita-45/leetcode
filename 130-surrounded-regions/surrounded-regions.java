class Solution {
    public void solve(char[][] board) {
        int n=board.length;
        int m=board[0].length;
        int vis[][]=new int [n][m];
        Queue<int []>q=new LinkedList<>();
           for (int j = 0; j < m; j++) {
            if (board[0][j] == 'O' && vis[0][j] == 0) {
                q.offer(new int[]{0, j});
                vis[0][j] = 1;
            }
            if (board[n - 1][j] == 'O' && vis[n - 1][j] == 0) {
                q.offer(new int[]{n - 1, j});
                vis[n - 1][j] = 1;
            }
        }
            for (int i = 0; i < n; i++) {
            if (board[i][0] == 'O' && vis[i][0] == 0) {
                q.offer(new int[]{i, 0});
                vis[i][0] = 1;
            }
            if (board[i][m - 1] == 'O' && vis[i][m - 1] == 0) {
                q.offer(new int[]{i, m - 1});
                vis[i][m - 1] = 1;
            }
        }


        int row[]={-1,0,1,0};
        int col[]={0,-1,0,1};
        while(!q.isEmpty())
        {
            int r=q.peek()[0];
            int c=q.peek()[1];
            q.poll();
          
            for(int i=0;i<4;i++)
            {
                int rowr=r+row[i];
                int colr=c+col[i];
                if(rowr>=0 && rowr<n&& colr>=0 && colr<m && vis[rowr][colr]==0 && board[rowr][colr]=='O')
                {
                    q.offer(new int []{rowr,colr});
                    vis[rowr][colr]=1;
                }
            }
        }

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(vis[i][j]==0 && board[i][j]=='O')
                board[i][j]='X';
            }
        }

    }
}