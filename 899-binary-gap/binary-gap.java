class Solution {
    public int binaryGap(int n) {
        if(Integer.bitCount(n)==1)
        return 0;
        int ans=0,prev=-1,cur=0,i=0;
        while(n>0)
        {
            if((n&1)==1)
            {
                cur=i;
                if(prev!=-1)
                ans=Math.max(ans,cur-prev);
                prev=cur;
            }
            n=n>>1;
            i++;
        }
        return ans;
    }
}