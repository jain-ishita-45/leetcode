class Solution {
    int lp=0,rp=0,ans=0;
    public String longestPalindrome(String s) {
        int max=0,start=0,end=0;
        String len="";
        for(int i=0;i<s.length();i++)
        {
            String left=check(s,i,i);
            String right=check(s,i,i+1);
            if(len.length()<left.length())
            len=left;
            if(len.length()<right.length())
            len=right;
        }
        return len;
    }

    public String check(String s, int l, int r)
    {
        int a=l,b=r;
        while(l>=0 && r<s.length() && s.charAt(l)==s.charAt(r) )
        {
            l--;
            r++;
        }
        return s.substring(l+1,r);
    }
}