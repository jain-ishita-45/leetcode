class Solution {
    public int reverse(int x) {
        int sign=1;
        if(x<0)
        {
            sign=-1;
            x=x*(-1);
        }
        long result=0;
        while(x>0)
        {
            int digit=x%10;
            result=result*10+digit;
            x=x/10;
        }
             if(sign==-1)
        result=result*(-1);
        if(result>=Integer.MAX_VALUE || result<=Integer.MIN_VALUE)
        return 0;
   
        return (int)result;
    }
}