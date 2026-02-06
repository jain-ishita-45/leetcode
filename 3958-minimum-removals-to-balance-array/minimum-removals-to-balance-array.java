class Solution {
    public int minRemoval(int[] nums, int k) {

        Arrays.sort(nums);
        if(nums.length==1) return 0;
        int l=0;
        int max=1;
    for(int r=0;r<nums.length;r++)
    {
        while(l<=r && ((long)nums[l]*k)<nums[r])
        l++;
        max=Math.max(max,r-l+1);
    }
    return nums.length-max;
    }
}