class Solution {
    public void moveZeroes(int[] nums) {
        int []n=new int[nums.length];
        int j=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=0)
            n[j++]=nums[i];
        }
        for(int i=0;i<nums.length;i++)
        nums[i]=n[i];
    }
}