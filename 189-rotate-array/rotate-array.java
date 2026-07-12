class Solution {
    public void rotate(int[] nums, int k) {
        if(k==nums.length) return;
        int n=nums.length;
        int arr[]=new int [n];
        for(int i=0;i<nums.length;i++)
        {
            
            arr[(i+k)%n]=nums[i];
            
        }
        for(int i=0;i<nums.length;i++)
        nums[i]=arr[i];
            }
}