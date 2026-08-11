class Solution {
    public int cherryPickup(int[][] grid) {
        int dp[][][]=new int[grid.length][grid[0].length][grid[0].length];
        for(int i=0;i<dp.length;i++)
        {
            for(int j=0;j<dp[0].length;j++)
            Arrays.fill(dp[i][j],-1);
        }
        return f(0,0,grid[0].length-1,grid.length,grid[0].length,grid,dp);
    }

    public int f(int i, int j1, int j2, int r, int c, int [][]grid, int [][][]dp)
    {
        if(j1<0 || j2<0 || j1>=c || j2>=c)
        return -10000;
        if(i==r-1)
        {
            if(j1==j2)
            return grid[i][j1];
            else
            return grid[i][j1]+grid[i][j2];
        }
        int maxi=-10000;
        if(dp[i][j1][j2]!=-1) return dp[i][j1][j2];
        for(int dj1=-1;dj1<=1;dj1++)
        {
            for(int dj2=-1;dj2<=1;dj2++)
            {
                int value=0;
                if(j1==j2) value=grid[i][j1];
                else
                value=grid[i][j1]+grid[i][j2];
                value+=f(i+1,j1+dj1,dj2+j2,r,c,grid,dp);
                maxi=Math.max(maxi,value);
              
            }
        }
        return   dp[i][j1][j2]=maxi;
    }
}