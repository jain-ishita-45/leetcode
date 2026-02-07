class Solution {
    public int numEnclaves(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int vis[][]=new int[n][m];
        Queue<int []>q=new LinkedList<>();
        for(int i=0;i<n;i++)
        {
            if(grid[i][0]==1)
            {
                vis[i][0]=1;
                q.offer(new int[]{i,0});
            }
            if(grid[i][m-1]==1)
            {
                vis[i][m-1]=1;
                q.offer(new int[]{i,m-1});
            }
        }

         for(int i=0;i<m;i++)
        {
            if(grid[0][i]==1)
            {
                vis[0][i]=1;
                q.offer(new int[]{0,i});
            }
            if(grid[n-1][i]==1)
            {
                vis[n-1][i]=1;
                q.offer(new int[]{n-1,i});
            }
        }

        int row[]={-1,0,1,0};
        int col[]={0,1,0,-1};
        while(!q.isEmpty())
        {
            int r=q.peek()[0];
            int c=q.peek()[1];
            q.poll();
            for(int i=0;i<4;i++)
            {
                int newr=r+row[i];
                int newc=c+col[i];
                if(newr>=0 && newr<n && newc>=0 && newc<m && vis[newr][newc]==0 && grid[newr][newc]==1)
                {
                    vis[newr][newc]=1;
                    q.offer(new int []{newr,newc});
                }
            }
        }
        int c=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(vis[i][j]==0 && grid[i][j]==1)
                c++;
            }
        }
        return c;

    }
}