class Solution {
    public int[] productExceptSelf(int[] nums) {
        int product=1,c=0;
        for(int i=0;i<nums.length;i++)
        { if(nums[i]!=0)
            product*=nums[i];
            else
            c++;
        }
        int []result=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0) {
                if(c==1)
            result[i]=product;
            else
            result[i]=0;
            continue;
            }

            if(c>=1 && nums[i]!=0) {result[i]=0;
            continue;}
            if(nums[i]!=0)
            result[i]=product/nums[i];
            
        }
        return result;
    }
}