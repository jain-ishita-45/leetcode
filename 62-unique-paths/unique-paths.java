class Solution {
    public int uniquePaths(int m, int n) {
        int dp[][]=new int[m][n];
        for(int i[]:dp)
        Arrays.fill(i,-1);
        return f(0,0,m,n,dp);    
        }

    public int f(int i, int j, int m, int n, int [][]dp)
    {
        if(i==m-1 && j==n-1 )
        return 1;
        if(i>=m || i<0 || j<0 || j>=n ) return 0;
        if(dp[i][j]!=-1) return dp[i][j];
        int right=f(i,j+1,m,n,dp);
        int left=f(i+1,j,m,n,dp);
        return dp[i][j]=left+right;
    }
}