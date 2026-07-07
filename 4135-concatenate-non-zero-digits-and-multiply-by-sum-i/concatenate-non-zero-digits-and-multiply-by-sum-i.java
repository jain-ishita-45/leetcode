class Solution {

    public long reverse(long n)
    {
        long r=0;
        while(n>0)
        {
            long digit=n%10;
            r=r*10+digit;
            n=n/10;
        }
        return r;
    }
    public long sumAndMultiply(int n) {

        long sum=0,result=0;
        while(n>0)
        {
            int digit=n%10;
            if(digit!=0)
            result=result*10+digit;
            n=n/10;
        }
        result=reverse(result);
        long ans=result;
        while(ans>0)
        {
            long digit=ans%10;
            sum+=digit;
            ans=ans/10;
        }
        return result*sum;
    }
}