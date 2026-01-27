class Solution {
    public int divide(int dividend, int divisor) {
        if(dividend==divisor)
        return 1;
        if(dividend==0)
        return 0;
        Boolean sign=true;
        if((dividend>=0 && divisor<0)||(dividend<=0 && divisor>0))
        sign=false;
        long n=Math.abs((long)dividend), d=Math.abs((long)divisor);
        long ans=0;
        while(n>=d)
        {
            int c=0;
            while(n>=(d<<(c+1)))
            c++;
            ans+=1<<c;
            n=n-(d<<c);
        }
        if(ans==(1<<31) && sign ==true)
        return Integer.MAX_VALUE;
         if(ans==(1<<31) && sign ==false)
        return Integer.MIN_VALUE;
        return (sign==true)? (int)ans: (int)(-1*ans);
    }
}