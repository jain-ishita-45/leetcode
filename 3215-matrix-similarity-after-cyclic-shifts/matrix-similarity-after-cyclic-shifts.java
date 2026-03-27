class Solution {
    public boolean areSimilar(int[][] mat, int k) {
        int m=mat[0].length;
        k=k%m;
        if(k==0) return true;
        int n=mat.length;
        int newmat[][]=new int[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            newmat[i][(j+k)%m]=mat[i][j];

        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                System.out.print(newmat[i][j] +" ");
                if(mat[i][j]!=newmat[i][j]) return false;

            }
            
        }
        return true;
    }
}