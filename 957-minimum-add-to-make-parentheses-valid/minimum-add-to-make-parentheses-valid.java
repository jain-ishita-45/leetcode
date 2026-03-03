class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> st=new Stack<>();
        int c=0,open=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='(')
            open++;
            else if(s.charAt(i)==')')
            {
                if(open>0) open--;
                else
                c++;
            }
        }
        return c+open;
    }
}