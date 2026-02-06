class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int n=mat.length;
        int m=mat[0].length;
        int vis[][]=new int[n][m];
        int dist[][]=new int[n][m];
        Queue<int[]>pq=new LinkedList<>();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(mat[i][j]==0)
                {
                    vis[i][j]=1;
                    dist[i][j]=0;
                    pq.offer(new int[]{i,j,0});
                    
                }
             
            }
        }
        int rowr[]={-1,0,1,0};
        int colr[]={0,-1,0,1};
        while(!pq.isEmpty())
        {
            int r=pq.peek()[0];
            int c=pq.peek()[1];
            int d=pq.peek()[2];
            pq.poll();
            
            for(int i=0;i<4;i++)
            {
                int nrow=r+rowr[i];
                int ncol=c+colr[i];
                if(nrow>=0 && nrow<n && ncol>=0 && ncol<m && vis[nrow][ncol]==0 && mat[nrow][ncol]==1)
                {
                    vis[nrow][ncol]=1;
                    dist[nrow][ncol]=d+1;
                    pq.offer(new int []{nrow,ncol,d+1});
                }
            }

        }
        return dist;

    }
}