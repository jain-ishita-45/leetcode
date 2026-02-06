class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder str=new StringBuilder();
        int c=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='(')
            {
                if(c>0)
                str.append(s.charAt(i));
                c++;
            }
            else if(s.charAt(i)==')')
            {
                c--;
                if(c>0)
                str.append(s.charAt(i));
            }
        }
        return str.toString();
    }
}