class Solution {

    public boolean check(int [][]grid, int t)

    {
        int n=grid.length;
        int dx[]={-1,0,1,0};
        int dy[]={0,-1,0,1};
        if (grid[0][0] > t) return false;
        int [][]vis=new int[n][n];
        vis[0][0]=1;
        Queue<int []>q=new LinkedList<>();
        q.offer(new int[]{0,0});
        int level=0;
        while(!q.isEmpty())
        {
            int sz=q.size();
            while(sz-->0)
            {
                int x=q.peek()[0];
                int y=q.peek()[1];
                q.poll();
                if(x==n-1 && y==n-1)
                return true;
                for(int k=0;k<4;k++)
                {
                    int nx=dx[k]+x;
                    int ny=dy[k]+y;
                    if(nx>=0 && nx<n && ny>=0 && ny<n && vis[nx][ny]==0 && grid[nx][ny]<=t)
                    {
                        q.offer(new int[]{nx,ny});
                        vis[nx][ny]=1;
                    }
                }
            }
            level++;
        }
        return false;
    }
    public int swimInWater(int[][] grid) {
        int low=grid[0][0];
        int high=0;
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            high=Math.max(high,grid[i][j]);
        }
        int ans=high;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(check(grid,mid))
            {
                ans=Math.min(ans,mid);
                high=mid-1;
            }
            else
            low=mid+1;
        }
        return ans;
    }
}