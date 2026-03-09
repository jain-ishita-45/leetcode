class Solution {

    public boolean ismatch(char a , char b)
    {
        if((a=='(' && b==')')|| (a=='[' && b==']') || a=='{' && b=='}')
        return true;
        return false;
    }
    public boolean isValid(String s) {
        Stack<Character> st=new Stack<>();

        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='('|| s.charAt(i)=='[' || s.charAt(i)=='{')
            st.push(s.charAt(i));
        
        else if( s.charAt(i)==')'|| s.charAt(i)==']' || s.charAt(i)=='}')
        {
            if(st.isEmpty()) return false;
            else
            {
                char x=st.pop();
                if(!ismatch(x,s.charAt(i))) return false;
            }
        }
        }
        if(!st.isEmpty()) return false;
        return true;

    }
}