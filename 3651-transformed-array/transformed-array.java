class Solution {
    public int[] constructTransformedArray(int[] nums) {
        int []result=new int[nums.length];
        int steps;
        int n=nums.length;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>0)
            {
                steps=(i+nums[i])%n;
                result[i]=nums[steps];
            }
            else if(nums[i]==0)
            result[i]=nums[i];
            else
            {
                steps=(i-Math.abs(nums[i]))%n;
                if(steps<0) steps=n+steps;
                result[i]=nums[steps];
            }
        }       
        return result;
    }
}