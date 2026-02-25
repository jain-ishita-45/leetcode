class Solution {

    public int check(int []wt, int mid)
    {
        int c=0;
        int sum=0;
        for(int i=0;i<wt.length;i++)
        {
            if((sum+wt[i])<=mid)
            sum+=wt[i];
            else
            {
                sum=wt[i];
                c++;
            }
        }
        System.out.println(mid+" "+c+1);
        return c+1;
    }
    public int shipWithinDays(int[] weights, int days) {
        int low=1;
        int high=0;
        for(int i:weights)
        {high+=i;
        low=Math.max(low,i);
        }
        System.out.print(high);
        int ans=-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(check(weights,mid)<=days)
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