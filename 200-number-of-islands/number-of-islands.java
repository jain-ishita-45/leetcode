class Solution {

    public void bfs(int i, int j, int [][]vis, char[][] grid)
    {
        int n=grid.length;
        int m=grid[0].length;
        Queue<int []>q=new LinkedList<>();
        q.offer(new int[]{i,j});
        int row[]={-1,0,1,0};
        int col[]={0,-1,0,1};
        vis[i][j]=1;
        while(!q.isEmpty())
        {
            int r=q.peek()[0];
            int c=q.peek()[1];
            q.poll();
            for(int k=0;k<4;k++)
            {
                int newr=r+row[k];
                int newc=c+col[k];
                if(newr<n && newr>=0 && newc<m && newc>=0 && vis[newr][newc]==0 && grid[newr][newc]=='1' )
                {
                      q.offer(new int[]{newr,newc});
                      vis[newr][newc]=1;
                }
            }
        }
    }
    public int numIslands(char[][] grid) {
        int c=0;
        int n=grid.length,m=grid[0].length;
        int vis[][]=new int[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(grid[i][j]=='1' && vis[i][j]==0)
                {
                    bfs(i,j,vis,grid);
                    c++;
                }
            }
       
        }
 return c;
    }
}