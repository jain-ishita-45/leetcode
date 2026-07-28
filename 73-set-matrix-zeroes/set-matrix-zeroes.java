class Solution {
    public void setZeroes(int[][] matrix) {
        int row[]=new int[matrix[0].length];
        int col[]=new int[matrix.length];
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                if(matrix[i][j]==0)
                {
                    row[j]=1;
                    col[i]=1;
                }
            }
        }
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {if(col[i]==1)
            {
                matrix[i][j]=0;

            }
            }
        }
        for(int i=0;i<matrix[0].length;i++)
        {
            for(int j=0;j<matrix.length;j++)
            {if(row[i]==1)
            {
                matrix[j][i]=0;

            }
            }
        }


    }
}