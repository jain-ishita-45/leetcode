// import java.util.*;
class Solution {
    public void rotate(int[][] matrix) {
       for(int i=0;i<matrix.length;i++) 
       {
        for(int j=0;j<matrix[0].length;j++)
        {
            if(i<j)
            {int temp=matrix[i][j];
            matrix[i][j]=matrix[j][i];
            matrix[j][i]=temp;
            }

        }
       }
    //    for(int i=0;i<matrix.length;i++)
    //    {  Sytem.out.println(" ");

    //     for(int j=0;j<matrix[0].length;j++)
    //     {
    //         Sytem.out.print(matrix[i][j]);
    //     }
    //    }
       for(int i=0;i<matrix.length;i++)
       {
        int m=matrix[0].length-1;
        for(int j=0;j<matrix[0].length/2;j++)
        {
            
            int temp=matrix[i][m];
            matrix[i][m]=matrix[i][j];
            matrix[i][j]=temp;
            m--;

        }
       }
    }
}