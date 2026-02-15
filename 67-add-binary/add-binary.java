class Solution {
    public String addBinary(String a, String b) {
        int n=a.length()-1,m=b.length()-1;
        int sum=0,carry=0;
        String ans="";
        while(n>=0 || m>=0)
        {
            sum=carry;
            if(n>=0)
            {
                sum+=a.charAt(n)-'0';
                n--;
            }
            if(m>=0)
            {
                sum+=b.charAt(m)-'0';
                m--;
            }
           ans+=((sum%2==0)? '0' : '1');
            carry=sum>1?1:0;
        }
        if(carry==1)
        ans+=1;
        StringBuilder a1=new StringBuilder(ans);
        a1.reverse();
        return a1.toString();
    }
}