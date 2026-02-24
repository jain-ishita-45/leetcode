class Solution {

    public long func(int []arr, int h)
    {
        long tt=0;
        for(int i=0;i<arr.length;i++)
         tt+=((arr[i]+h-1)/h);
        return tt;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int max=Integer.MIN_VALUE;
        for(int i:piles)
        max=Math.max(i,max);
        int high=max,low=1,ans=-1;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            long total=func(piles,mid);
            if(total<=(long)h)
            {
                ans=mid;
                high=mid-1;

            }
            else
            low=mid+1;
        }
        return ans;
    }
}