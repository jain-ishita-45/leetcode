class Solution {

    public int atmost(int nums[], int k)
    {
        int c=0,r=0,l=0,len=0;
        if(k<0) return 0;
        while(r<nums.length)
        {
            if(nums[r]%2==1)
            c++;;
            while(c>k)
            {
                if(nums[l]%2==1)
                {
                    
                    c--;
                }
                l++;
            }
            len+=r-l+1;
            r++;
        }
        return len;
    }
    public int numberOfSubarrays(int[] nums, int k) {
        return atmost(nums,k)-atmost(nums,k-1);
    }
}