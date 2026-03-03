class Solution {

    int matele(int [][]mat, int n, int m, int col)
    {
        int index = -1;
        int maxe = -1;

        for(int i = 0; i < n; i++)   // use n (rows)
        {
            if(mat[i][col] > maxe)   // correct comparison
            {
                maxe = mat[i][col];
                index = i;
            }
        }
        return index;
    }

    public int[] findPeakGrid(int[][] mat) {
        int low = 0, high = mat[0].length - 1;

        while(low <= high)
        {
            int mid = (low + high) / 2;

            int row = matele(mat, mat.length, mat[0].length, mid);

            int left = (mid - 1 >= 0) ? mat[row][mid - 1] : -1;
            int right = (mid + 1 < mat[0].length) ? mat[row][mid + 1] : -1;

            if(mat[row][mid] > left && mat[row][mid] > right)
                return new int[]{row, mid};

            else if(mat[row][mid] < left)
                high = mid - 1;

            else
                low = mid + 1;
        }

        return new int[]{-1, -1};
    }
}