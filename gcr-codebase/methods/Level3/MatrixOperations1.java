public class MatrixOperations1{

    // Method to create a random matrix
    public static int[][] createRandomMatrix(int rows, int cols) {
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
        for (int j = 0; j < cols; j++) {
        matrix[i][j] = (int) (Math.random() * 10); // 0 to 9
        }
        }
        return matrix;
    }

    // Method to add two matrices
    public static int[][] addMatrices(int[][] A, int[][] B) {
        int rows = A.length;
        int cols = A[0].length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
        for (int j = 0; j < cols; j++) {
        result[i][j] = A[i][j] + B[i][j];
        }
        }
        return result;
    }

    // Method to subtract two matrices
    public static int[][] subtractMatrices(int[][] A, int[][] B) {
        int rows = A.length;
        int cols = A[0].length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
        for (int j = 0; j < cols; j++) {
        result[i][j] = A[i][j] - B[i][j];
        }
        }
        return result;
    }

    // Method to multiply two matrices
    public static int[][] multiplyMatrices(int[][] A, int[][] B) {
        int rows = A.length;
        int cols = B[0].length;
        int common = B.length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
        for (int j = 0; j < cols; j++) {
        for (int k = 0; k < common; k++) {
        result[i][j] += A[i][k] * B[k][j];
        }
        }
        }
        return result;
    }

    // Method to display a matrix
    public static void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
        for (int value : row) {
        System.out.print(value + "\t");
        }
        System.out.println();
        }
    }

     public static void main(String[] args) {

        // Matrix dimensions
        int rows = 2;
        int cols = 3;
        int common = 3;
        // Create random matrices
        int[][] A = createRandomMatrix(rows, cols);
        int[][] B = createRandomMatrix(rows, cols);
        int[][] C = createRandomMatrix(common, rows);

        //Display result
        System.out.println("Matrix A:");
        displayMatrix(A);
        System.out.println("\nMatrix B:");
        displayMatrix(B);
        System.out.println("\nA + B:");
        displayMatrix(addMatrices(A, B));
        System.out.println("\nA - B:");
        displayMatrix(subtractMatrices(A, B));
        System.out.println("\nMatrix C:");
        displayMatrix(C);
        System.out.println("\nA x C:");
        displayMatrix(multiplyMatrices(A, C));
    }
}
