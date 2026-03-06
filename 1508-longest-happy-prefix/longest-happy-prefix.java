class Solution {
    public String longestPrefix(String s) {
        int n=s.length();
        int i=1,len=0;
        int lps[]=new int[n];
        while(i<n)
        {
            if(s.charAt(i)==s.charAt(len))
            {
                len+=1;
                lps[i]=len;
                i++;
            }
            else
            {
                if(len!=0)
                len=lps[len-1];
                else
                {
                    lps[i]=0;
                    i++;
                }
            }

        }
        String ans=s.substring(0,len);
        return ans;
    }
}