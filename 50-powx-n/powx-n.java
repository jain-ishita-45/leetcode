class Solution {
    public double myPow(double x, int n) {
        if(n<0)
        {
            x=1/x;
            n=(-1)*n;
        }
        return powerr(x,n);
    }

    public double powerr(double x, int n)
    {
        if(n==0) return 1;
        double ans=powerr(x,n/2);
        if(n%2==0)
        return (double)ans*ans;
        else return (double)ans*ans*x;
    }
}