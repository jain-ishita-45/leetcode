class Solution {
    public int maxCoins(int[] nums) {
        int nums2[]=new int[nums.length+2];
        nums2[0]=1;
        int j=1;
        for(int i=0;i<nums.length;i++)
        nums2[j++]=nums[i];
        nums2[j]=1;
        int dp[][]=new int[nums.length+2][nums.length+2];
        for(int r[]:dp)
        Arrays.fill(r,-1);
        return f(1,nums.length,nums2,dp);

    }

    public int f(int i, int j, int nums[],int dp[][])
    {
        if(i>j) return 0;
        if(dp[i][j]!=-1) return dp[i][j];
        int maxi=-100000000;
        for(int ind=i;ind<=j;ind++)
        {
            int cost=nums[i-1]*nums[ind]*nums[j+1] + f(i,ind-1,nums,dp) + f(ind+1,j,nums,dp);
            maxi=Math.max(maxi,cost);
        }
        return dp[i][j]=maxi;
    }
}