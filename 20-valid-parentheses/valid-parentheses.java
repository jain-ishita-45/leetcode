class Solution {

    public boolean match(char a, char b)
    {
        if((a=='(' && b==')')||(a=='[' && b==']')||(a=='{' && b=='}'))
        return true;
        return false;
    }
    public boolean isValid(String s) {
        Stack<Character> st=new Stack<>();
        char ch;
        for(int i=0;i<s.length();i++)
        {
            ch=s.charAt(i);
            if(ch=='(' || ch=='[' || ch=='{')
            st.push(ch);
            else if(st.isEmpty())
            return false;
            else if(ch==']'|| ch=='}' || ch==')')
            {
                char c=st.pop();
                if((match(c,ch))==false)
                return false;
            }
            
        }
        if(st.isEmpty())
        return true;
        return false;
        
    }
}