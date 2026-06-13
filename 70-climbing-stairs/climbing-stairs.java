class Solution {
    public int climbStairs(int n) {
        int dp[]=new int[n+1];
        Arrays.fill(dp,0);
        return f(dp,0,n);
    }

    public int f(int []dp, int i, int n)
    {
        if(i>n) return 0;
        if(i==n) return 1;
        if(dp[i]!=0) return dp[i];
        int take=f(dp,i+1,n);
        int nottake=f(dp,i+2,n);
        return dp[i]=take+nottake;

    }
}