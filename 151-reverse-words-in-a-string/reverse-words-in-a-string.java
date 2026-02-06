class Solution {
    public String reverseWords(String s) {
        String words[]=s.split("\\s+");
        for(String w:words)
        System.out.println(w);
        String ans="";
        Stack<String> st=new Stack<>();
        for(int i=0;i<words.length;i++)
        st.push(words[i]);
        while(!st.isEmpty())
        {
            String a=st.pop();
            ans+=a;
            if(!st.isEmpty())
            ans+=" ";
        }
        
        if(ans.charAt(ans.length()-1)==' ')
        return ans.substring(0,ans.length()-1);
        return ans;
    }
}