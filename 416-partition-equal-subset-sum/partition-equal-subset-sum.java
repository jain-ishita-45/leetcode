class Solution {
    public boolean canPartition(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++)
        sum+=nums[i];
        if(sum%2!=0) return false;
        Boolean [][]dp=new Boolean[nums.length+1][sum/2+1];
        return f(nums,sum/2,0,dp);
    }

    public boolean f(int nums[],int sum, int i, Boolean dp[][])
    {
        if(sum==0)
        return true;
        if(i==nums.length) return false;
        if(dp[i][sum]!=null) return dp[i][sum];
        Boolean take=false;
        if(nums[i]<=sum)
        take=f(nums,sum-nums[i],i+1,dp);
        Boolean nottake=f(nums,sum,i+1,dp);
        return dp[i][sum]=take|| nottake;
    }
}