class Solution {
    public int numSpecial(int[][] mat) {
        int n=mat.length,m=mat[0].length;
        int []rowc=new int[n];
        int []colc=new int[m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(mat[i][j]==1)
                {
                    rowc[i]++;
                    colc[j]++;
                }
            }
        }
        int ans=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(mat[i][j]==1 && rowc[i]==1 && colc[j]==1)
                ans++;
            }
        }
        return ans;
    }
}