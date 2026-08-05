class Solution {
    public int longestValidParentheses(String s) {
        Stack<Integer> st=new Stack<>();
        st.push(-1);
        int count=0,ans=0;
        if(s.length()==0) return 0;
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(c=='(')
            st.push(i);
            else if(c==')')
            {
                st.pop();
                if(st.isEmpty() )
                {
                   st.push(i);
                   
                }
                
                else
                {
                    ans=Math.max(ans,i-st.peek());
                }
            }
        }
        
        return ans;
    }
}