class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        int[][] arr = new int[n][n];
        int temp=0;
        for(int i=0;i<n-1;i++)
        {
            for(int j =i+1;j<n;j++)
            {
                temp = matrix[j][i];
                matrix[j][i]=matrix[i][j];
                matrix[i][j]=temp;
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j =0;j<n/2;j++)
            {
                temp = matrix[i][n-1-j];
                matrix[i][n-1-j]=matrix[i][j];
                matrix[i][j]=temp;
            }
        }
        
        
    }
}