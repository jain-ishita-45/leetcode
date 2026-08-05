class Solution {
    public int longestIncreasingPath(int[][] matrix) {
        int dp[][]=new int[matrix.length][matrix[0].length];
        for(int i[]:dp)
        Arrays.fill(i,0);
        
        int y=0;
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                
                y=Math.max(y,check(i,j,dp,matrix));
            }
        }
        return y;
    }

    public int check(int i, int j, int [][]dp, int [][]matrix)
    {
        if(i<0 || j<0 ||i>=matrix.length || j>=matrix[0].length)
        return 0;
        if(dp[i][j]!=0)
        return dp[i][j];
        dp[i][j]=1;
        
        if(j+1<matrix[0].length && matrix[i][j]<matrix[i][j+1])
        dp[i][j]=Math.max (dp[i][j],1+check(i,j+1,dp,matrix));
    if(j-1>=0 && matrix[i][j]<matrix[i][j-1])
        dp[i][j]=Math.max(dp[i][j],1+check(i,j-1,dp,matrix));
        if(i+1<matrix.length && matrix[i][j]<matrix[i+1][j])
        dp[i][j]=Math.max(dp[i][j],1+check(i+1,j,dp,matrix));
        if(i-1>=0 && matrix[i][j]<matrix[i-1][j])
        dp[i][j]=Math.max(dp[i][j],1+check(i-1,j,dp,matrix));
        return dp[i][j];
    }
}