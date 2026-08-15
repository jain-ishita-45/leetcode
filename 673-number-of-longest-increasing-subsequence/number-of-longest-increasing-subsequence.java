class Solution {
    public int findNumberOfLIS(int[] nums) {
        int dp[]=new int[nums.length];
         int c[]=new int[nums.length];
        int maxi=0,count=0;
        for(int i=0;i<nums.length;i++)
        {
            dp[i]=1;
            c[i]=1;
            for(int prev=0;prev<i;prev++ )
            {
                if(nums[prev]<nums[i] && 1+dp[prev]>dp[i])
                {
                    dp[i]=1+dp[prev];
                    c[i]=c[prev];
                }
                else if(nums[prev]<nums[i] && 1+dp[prev]==dp[i])
                {
                    c[i]+=c[prev];
                }
            }
            maxi=Math.max(maxi,dp[i]);
        }
        for(int i=0;i<nums.length;i++)
        {
            if(dp[i]==maxi)
            count+=c[i];
        }
        return count;
    }
}