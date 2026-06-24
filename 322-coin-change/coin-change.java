class Solution {
    public int coinChange(int[] coins, int amount) {
        int [][]dp=new int[coins.length+1][amount+1];
        for(int row[]:dp)
        Arrays.fill(row,-1);
        int ans=f(coins,0,amount,dp);
        return ans>=(int)1e9?-1:ans;
    }

    public int f(int coins[], int i, int amount, int [][]dp)
    {
        if(amount==0) return 0;
        if(i==coins.length) return (int)1e9;
        if(dp[i][amount]!=-1) return dp[i][amount];
        int take=(int)1e9;
        if(coins[i]<=amount)
        take=1+f(coins,i, amount-coins[i],dp);
        int nt=f(coins,i+1,amount,dp);
        return dp[i][amount]=Math.min(take,nt);
    }
}