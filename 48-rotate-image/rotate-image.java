class Solution {
    public void rotate(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(i<=j)
                {
                    int temp=matrix[i][j];
                    matrix[i][j]=matrix[j][i];
                    matrix[j][i]=temp;
                }
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            System.out.println(matrix[i][j]);
        }
        for(int i=0;i<n;i++)
        {
            m=matrix[0].length-1;
            int j=0;
            while(j<m)
            {
                int temp=matrix[i][j];
                matrix[i][j]=matrix[i][m];
                matrix[i][m]=temp;
                j++;
                m--;
            }
        }
    }
}