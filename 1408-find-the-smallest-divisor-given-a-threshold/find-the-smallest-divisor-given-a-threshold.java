class Solution {

    public int check(int []nums, int mid)
    {
        if(mid==0) return 0;
        double sum=0;
        for(int i=0;i<nums.length;i++)
        {
              sum+=((nums[i]+mid-1)/mid);
        }
        return (int)sum;
    }
    public int smallestDivisor(int[] nums, int threshold) {
        Arrays.sort(nums);
        int low=1,high=nums[nums.length-1];
        int ans=-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(check(nums,mid)<=threshold)
            {
                ans=mid;
                high=mid-1;
            }
            else
             low=mid+1;
        }
        return ans;
    }
}