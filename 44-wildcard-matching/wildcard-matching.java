class Solution {
    public boolean isMatch(String s, String p) {
        Boolean [][]dp=new Boolean[s.length()][p.length()];
        return f(s.length()-1,p.length()-1,s,p,dp);
    }

    public boolean f(int i, int j,String s, String p, Boolean[][]dp)
    {
        if(i<0 && j<0) return true;
         if(i>=0 && j<0)
         return false;
       
        if(i<0 && j>=0)
        {
            for(int ii=0;ii<=j;ii++)
            {
                if(p.charAt(ii)!='*')
                return false;
            }
            return true;
        }
        if(dp[i][j]!=null) return dp[i][j];
        if(s.charAt(i)==p.charAt(j) || p.charAt(j)=='?')
        return dp[i][j]=f(i-1,j-1,s,p,dp);
        else if (p.charAt(j)=='*')
        return dp[i][j]=f(i-1,j,s,p,dp) || f(i,j-1,s,p,dp);
        return dp[i][j]=false;
    }
}