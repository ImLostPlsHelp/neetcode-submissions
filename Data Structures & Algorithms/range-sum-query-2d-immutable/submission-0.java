class NumMatrix {
    int[][] prefixMatrix;

    public NumMatrix(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;

        prefixMatrix = new int[row+1][col+1];

        for(int i = 0; i < row; i++) {
            int prefix = 0;
            for(int j = 0; j < col; j++) {
                prefix += matrix[i][j];
                int above = prefixMatrix[i][j+1];
                prefixMatrix[i+1][j+1] = prefix + above;
            }
        }

    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        row1 = row1+1;
        col1 = col1+1;
        row2 = row2+1;
        col2 = col2+1;

        int bottomRight = prefixMatrix[row2][col2];
        int above = prefixMatrix[row1-1][col2];
        int left = prefixMatrix[row2][col1-1];
        int topLeft = prefixMatrix[row1-1][col1-1];

        return bottomRight - left - above + topLeft;
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */