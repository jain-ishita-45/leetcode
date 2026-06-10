class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        Queue<int []> q=new LinkedList<>();
        q.offer(new int[]{sr,sc});
        int startcolor=image[sr][sc];
        int n=image.length, m=image[0].length;
        int vis[][]=new int[n][m];
        int drow[]={-1,0,1,0};
        int dcol[]={0,-1,0,1};
        
        while(!q.isEmpty())
        {
            int []x=q.poll();
            int r=x[0];
            int c=x[1];
            for(int i=0;i<4;i++)
            {
                int newr=r+drow[i];
                int newc=c+dcol[i];
                if(newr>=0 && newc>=0 && newr<n && newc<m && vis[newr][newc]!=1 && image[newr][newc]==startcolor)
                {
                    
                    vis[newr][newc]=1;
                    q.offer(new int[]{newr,newc});
                }
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(vis[i][j]==1)
                {
                    vis[i][j]=color;
                }
                else
                vis[i][j]=image[i][j];
            }
        }
        vis[sr][sc]=color;
        return vis;
    }
}