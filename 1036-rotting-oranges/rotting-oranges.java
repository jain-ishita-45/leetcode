class Solution {
    public int orangesRotting(int[][] grid) {
        int n=grid.length, m=grid[0].length;
        int [][]vis=new int [n][m];
        Queue<int []> q=new LinkedList<>();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(grid[i][j]==2)
                q.offer(new int[]{i,j,0});
            }
        }
        int drow[]={-1,0,1,0};
        int dcol[]={0,-1,0,1};
        int time=0;
        while(!q.isEmpty())
        {
            int row[]=q.poll();
            time=row[2];
            int r=row[0];
            int c=row[1];
            for(int i=0;i<4;i++)
            {
                int newr=r+drow[i];
                int newc=c+dcol[i];
                if(newr>=0 && newc>=0 && newr<n && newc<m && vis[newr][newc]==0 && grid[newr][newc]==1)
                {
                    vis[newr][newc]=1;
                    q.offer(new int[]{newr,newc,time+1});
                }
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(vis[i][j]==0 && grid[i][j]==1)
                return -1;
            }
        }
        return time;
    }
}