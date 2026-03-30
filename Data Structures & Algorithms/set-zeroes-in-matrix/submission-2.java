class Solution {
    public void setZeroes(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        // First pass: mark zeros with a placeholder
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == 0) {
                    // mark the row
                    for (int k = 0; k < cols; k++) {
                       if(matrix[i][k]!=0)matrix[i][k]=Integer.MIN_VALUE +1;
                    }
                    // mark the column
                    for (int k = 0; k < rows; k++) {
                        if (matrix[k][j] != 0) matrix[k][j] = Integer.MIN_VALUE + 1;
                    }
                }
            }
        }

        // Second pass: convert all placeholders to 0
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == Integer.MIN_VALUE + 1) {
                    matrix[i][j] = 0;
                }
            }
        }
    }
}
