class Solution {

    public int f(int i,int j, String str1, String str2, int [][]dp)
    {
        if(i<0 || j<0) return 0;
        if(dp[i][j]!=-1) return dp[i][j];
        if(str1.charAt(i)==str2.charAt(j))
        {
            return dp[i][j]=1+f(i-1,j-1,str1,str2,dp);
        }
        return dp[i][j]=Math.max(f(i-1,j,str1,str2,dp),f(i,j-1,str1,str2,dp));
    }

    public String shortestCommonSupersequence(String str1, String str2) {
        int dp[][]=new int[str1.length()][str2.length()];
        for(int []i:dp)
        Arrays.fill(i,-1);
        int len=f(str1.length()-1,str2.length()-1,str1,str2,dp);
        StringBuilder ans=new StringBuilder();
        int i=str1.length()-1, j=str2.length()-1;
        while(i>=0 && j>=0)
        {
            if(str1.charAt(i)==str2.charAt(j))
            {
                ans.append(str1.charAt(i));
                i--;
                j--;
            }
            else if (i==0)
            {
                ans.append(str2.charAt(j));
                j--;
            }
            else if(j==0 )
            {
                ans.append(str1.charAt(i));
                i--;
            }
            else if(dp[i-1][j]>dp[i][j-1])
            {
                ans.append(str1.charAt(i));
                i--;
            }
            else
            {
                 ans.append(str2.charAt(j));
                j--;
            }
        }
        while(i>=0)
        {
            ans.append(str1.charAt(i));
                i--;

        }

        while(j>=0)
        {
            ans.append(str2.charAt(j));
                j--;
        }
        return ans.reverse().toString();
    }
}