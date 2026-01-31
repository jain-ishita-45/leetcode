class Solution {
    public int minDistance(String word1, String word2) {
        int [][]dp=new int[word1.length()][word2.length()];
        for(int []row:dp)
        Arrays.fill(row,-1);
        return f(word1.length()-1,word2.length()-1,dp,word1,word2);
    }

    public int f(int i, int j, int [][]dp,String s,String p)
    {
        if(i<0) return j+1;
        if(j<0) return i+1;
        if(dp[i][j]!=-1) return dp[i][j];
        if(s.charAt(i)==p.charAt(j))
        return dp[i][j]=f(i-1,j-1,dp,s,p);
        else
        return dp[i][j]=Math.min(f(i-1,j-1,dp,s,p),Math.min(f(i,j-1,dp,s,p),f(i-1,j,dp,s,p)))+1;

    }
}