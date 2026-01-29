class Solution {
    public double myPow(double x, int n) {
        long N=n;
        if (n<0)
        {
            x=1/x;
            n=(-1)*n;
        }
        return pow(x,n);
    }

    public double pow(double x, int n)
    {
        if (n==0 )
        return 1;
        double half= pow(x,n/2);
        if(n%2==0)
        return half*half;
        else
        return x*half*half;
    }
}