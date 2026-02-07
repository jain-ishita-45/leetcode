class Solution {
    public int minimumDeletions(String s) {
        int n=s.length();
        int c[]=new int[n+1];
        for(int i=0;i<n;i++)
        {
            if(s.charAt(i)=='a')
            c[i+1]=1;
            c[i+1]+=c[i];
        }
        int mini=Math.min(c[n],n-c[n]);
        for(int i=1;i<=n;i++)
        {
            int leftb=i-c[i];
            int right=c[n]-c[i];
            mini=Math.min(mini,leftb+right);
        }
        return mini;
        
    }
}