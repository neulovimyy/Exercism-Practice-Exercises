
class Matrix {

    String matrixString;
    public Matrix(String matrixAsString) {
        this.matrixString = matrixAsString;
    }

    public int[][] getMatrix() {
        String[] row = matrixString.split("\n");
        String[] column = row[0].split(" ");
        int[][] matrix = new int[row.length][column.length];
        for (int i = 0; i < row.length; i++) {
            column = row[i].split(" ");
            for (int j = 0; j < column.length; j++) {
                matrix[i][j] = Integer.parseInt(column[j]);
            }
        }
        return matrix;
    }

    public int[] getRow(int rowNumber) {
        int[][] matrix = getMatrix();
        int[] output = new int[matrix[0].length];
        for (int i = 0; i < matrix[0].length; i++) {
            output[i] = matrix[rowNumber-1][i];
        }
        return output;
    }

    public int[] getColumn(int columnNumber) {
        int[][] matrix = getMatrix();
        int[] output = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            output[i] = matrix[i][columnNumber-1];
        }
        return output;
    }
}
