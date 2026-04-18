class Solution {
    public int mirrorDistance(int n) {
        int n1=n;
        int rev=0;
        while(n1>0)
        {
            int dig=n1%10;
            rev=rev*10+dig;
            n1=n1/10;
        }
        return Math.abs(n-rev);
    }
}