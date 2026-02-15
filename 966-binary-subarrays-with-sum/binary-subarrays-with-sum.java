class Solution {

    public int atmost(int []nums, int goal)
    {
          if(goal<0) return 0;
        int l=0,r=0,n=nums.length,sum=0,c=0;
        while(r<n)
        {
            sum+=nums[r];
            while(sum>goal)
            {
                sum-=nums[l];
                l++;
            }
            c+=(r-l+1);
            r++;
        }
        return c;
    }
    public int numSubarraysWithSum(int[] nums, int goal) {
      
        return atmost(nums,goal)-atmost(nums,goal-1);
        
        
    }
}