class Solution {
     public List<String> generateParenthesis(int n) {
        List<String> ans=new ArrayList<>();
        construct(0,0,n,ans,"");
        return ans;
    }

    public void construct(int open,int close,int n,List<String> result, String ans)
    {
        if(ans.length()==2*n)
        {
            result.add(ans);
            return;
        }
        if(open<n)
         construct(open+1,close,n,result,ans+"(");
         if(close<open)
          construct(open,close+1,n,result,ans+")");
        
    }
}