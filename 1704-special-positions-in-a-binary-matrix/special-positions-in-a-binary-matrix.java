class Solution {
    public boolean check(int i,int j,int n, int m, int [][]mat)
    {
        int one=0,ones=0;
        for(int k=0;k<m;k++)
        if(mat[i][k]==1)
        one++;
        for(int k=0;k<n;k++)
        if(mat[k][j]==1)
        ones++;
        if(one==1 && ones==1) return true;
        return false;
        
    }
    public int numSpecial(int[][] mat) {
        int c=0;
        int n=mat.length,m=mat[0].length;
        for(int i=0;i<mat.length;i++)
        {
            for(int j=0;j<mat[0].length;j++)
            {
                if(mat[i][j]==1)
                {
                    if(check(i,j,n,m,mat))
                    c++;
                }
            }
        }
        return c;
    }
}