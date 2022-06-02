class Solution {
    public int[][] transpose(int[][] matrix) {
        int[][] matrixnew = new int[matrix[0].length][matrix.length];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                matrixnew[j][i]=matrix[i][j];
            }
        }
        return matrixnew;
        // throw new IllegalArgumentException("No match found");
    }
}