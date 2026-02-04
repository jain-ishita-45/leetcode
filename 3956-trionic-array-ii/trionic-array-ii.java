class Solution {
    public long maxSumTrionic(int[] nums) {
        int n=nums.length;
        long prev=nums[0];
        long NEG = (long)-1e18;
        long a =NEG,b=NEG,c=NEG,ans=NEG;
        for(int i=1;i<n;i++)
        {
            long new_a =NEG,new_b=NEG,new_c=NEG;
            long cur=nums[i];
            if(cur>prev )
            {
                new_a=Math.max(a,prev)+cur;
                new_c=Math.max(b,c)+cur;
            }
            else if(cur<prev)
            {
                new_b=Math.max(b,a)+cur;
            }
            a=new_a;
            b=new_b;
            c=new_c;
            ans=Math.max(ans,c);
            prev=cur;
        }
        return ans;

    }
}