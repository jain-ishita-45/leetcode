class Solution {
    public String maximumXor(String s, String t) {
        StringBuilder result=new StringBuilder();
        int ones=0, zeros=0;
        for(int i=0;i<t.length();i++)
        {
            if(t.charAt(i)=='1') ones++;
            else
            zeros++;
        }
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='1')
            {
                if(zeros>0)
                {
                    result.append('1');
                    zeros--;
                }
                else
                {
                   result.append('0');
                   ones--; 
                }
            }
            else
            {
                if(ones>0)
                {
                    result.append('1');
                    ones--;
                }
                else
                {
                    result.append('0');
                    zeros--;
                }
            }
        }
        return result.toString();
    }
}