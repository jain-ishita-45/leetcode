class Solution {
    public String addBinary(String a, String b) {
        StringBuilder result=new StringBuilder();
        if(a.length()<b.length())
        return addBinary(b,a);
        int i=a.length()-1,j=b.length()-1,carry=0,sum=0;
        while(i>=0 || j>=0)
        {
             sum=carry;
            if(i>=0)
            {
                sum+=a.charAt(i)-'0';
                i--;
            }
           
            if(j>=0)
            {
                sum+=b.charAt(j)-'0';
                j--;
            }
            result.append((sum%2==0)?'0':'1');
            carry=sum>1?1:0;

        }
        if(carry==1) result.append(1);
        return result.reverse().toString();
    }
}