package mangchuong2;

import java.util.Arrays;

public class bai10 {
    public static void main(String[] args) {
        double[][] matrix = {
                {2, 3, 4},
                {0, 5, 6},
                {0, 0, 7}
        };

        System.out.println("Ma trận ban đầu:");
        printMatrix(matrix);

        double determinant = triangularizeMatrix(matrix);

        System.out.println("\nMa trận tam giác:");
        printMatrix(matrix);

        System.out.println("\nĐịnh thức của ma trận tam giác: " + determinant);
    }

    public static double triangularizeMatrix(double[][] matrix) {
        int n = matrix.length;
        double determinant = 1;

        for (int i = 0; i < n - 1; i++) {
            for (int k = i + 1; k < n; k++) {
                if (matrix[k][i] != 0) {
                    double factor = -matrix[k][i] / matrix[i][i];
                    for (int j = i; j < n; j++) {
                        matrix[k][j] += factor * matrix[i][j];
                    }
                }
            }
        }

        // Tính định thức
        for (int i = 0; i < n; i++) {
            determinant *= matrix[i][i];
        }

        return determinant;
    }

    public static void printMatrix(double[][] matrix) {
        for (double[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }
}

