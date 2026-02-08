class Solution {
    public int dominantIndices(int[] nums) {
        int avg[]=new int[nums.length-1];
        int n=nums.length;
        for(int i=0;i<n-1;i++)
        {
            int sum=0;
            for(int j=i+1;j<n;j++)
            sum+=nums[j];
            avg[i]=sum/(n-i-1);
        }
        for(int i=0;i<n-1;i++)
        System.out.println(avg[i]);
        int c=0;
        for(int i=0;i<n-1;i++)
        {
            if(nums[i]>avg[i])
            c++;
        }
        return c;
    }
}