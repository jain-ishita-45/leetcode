class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        if(grid[0][0]!=0) return -1;
        Queue<int []>q=new LinkedList<>();
        q.offer(new int[]{0,0,1});
        int row[]={-1,0,1,0,1,-1,1,-1};
        int col[]={0,-1,0,1,1,1,-1,-1};
        int n=grid.length,m=grid[0].length;
        int dist[][]=new int[n][m];
        int vis[][]=new int[n][m];
        vis[0][0]=1;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            dist[i][j]=(int)1e9;
        }
        dist[0][0]=1;
        while(!q.isEmpty())
        {
            int r=q.peek()[0];
            int c=q.peek()[1];
            int d=q.peek()[2];
            q.poll();
            for(int i=0;i<8;i++)
            {
                int nrow=r+row[i];
                int ncol=c+col[i];
                if(nrow>=0 && nrow<n && ncol>=0 && ncol<m && d+1<dist[nrow][ncol] && grid[nrow][ncol]==0)
                {
                    q.offer(new int[]{nrow,ncol,d+1});
                    dist[nrow][ncol]=d+1;

                }
            }
        }
        if(dist[n-1][n-1]==1e9) return -1;
        return dist[n-1][n-1];    }
}