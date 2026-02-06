class Solution {
    public int[] rearrangeArray(int[] nums) {
        int pos=0,neg=0;
        int n=nums.length;
        int result[]=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>0)
            {
                pos=i;
                break;
            }
        }
         for(int i=0;i<nums.length;i++)
        {
            if(nums[i]<0)
            {
                neg=i;
                break;
            }
        }

        for(int i=0;i<nums.length;i++)
        {
            if(i%2==0)
            {
                result[i]=nums[pos++];
                while(pos<n && nums[pos]<0)
                pos++;
            }
            else
            {
                result[i]=nums[neg++];
                while(neg<n && nums[neg]>0)
                neg++;
            }
        }
        return result;
    }
}