class Solution {
    public int myAtoi(String s) {
        int i=0, n=s.length(),sign=1;
        while(i<n && s.charAt(i)==' ')
        i++;
        if(i<n && (s.charAt(i)=='+' || s.charAt(i)=='-'))
        {
            if(s.charAt(i)=='+')
            sign=+1;
            else
            sign=-1;
            i++;
        }
        long ans=0;
        if(i<n && (s.charAt(i)=='+' || s.charAt(i)=='-'))
        return 0;
        while(i< n && s.charAt(i)>='0' && s.charAt(i)<='9')
        {
            int digit=s.charAt(i)-'0';
           
            if(ans>(Integer.MAX_VALUE-digit)/10)
            return sign==1? Integer.MAX_VALUE: Integer.MIN_VALUE;
             ans=ans*10+digit;
            i++;
        }
        if(sign==1)
        return (int)ans;
        return (int)ans*(-1);

    }
}