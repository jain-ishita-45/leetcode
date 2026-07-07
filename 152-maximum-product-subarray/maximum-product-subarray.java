class Solution {
    public int maxProduct(int[] nums) {
        int sum=1,product=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            sum*=nums[i];
            product=Math.max(product,sum);
            if(sum==0) sum=1;
        }
        sum=1;
        for(int i=nums.length-1;i>=0;i--)
        {
            sum*=nums[i];
            product=Math.max(product,sum);
            if(sum==0) sum=1;

        }
        return product;
    }
}