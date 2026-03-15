class Solution {
    public void setZeroes(int[][] matrix) {
        int col0 = 1;
        int rows = matrix.length;
        int cols = matrix[0].length;

        // Mark zeroes in the first row and column
        for (int i = 0; i < rows; i++) {
            if (matrix[i][0] == 0) col0 = 0;  // Track first column separately
            for (int j = 1; j < cols; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        // Set zeroes based on the marks (bottom-up to avoid overwriting)
        for (int i = rows - 1; i >= 0; i--) {
            for (int j = cols - 1; j >= 1; j--) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
            if (col0 == 0) {
                matrix[i][0] = 0;
            }
        }
    }
}
