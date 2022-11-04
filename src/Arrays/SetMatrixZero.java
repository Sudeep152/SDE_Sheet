package Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class SetMatrixZero {
    public static void main(String[] args) {

        int[][] arr = {
                {1, 1, 1},
                {1, 0, 1},
                {1, 1, 1}
        };
        //setZeroesNaive(arr);

        EfficientApproach(arr);

    }

    public static void setZeroesNaive(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][j] = -1;
                }
            }
        }

        for (int i = 0; i < m; i++) {

            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == -1) {
                    matrix[i][j] = 0;
                    for (int k = 0; k < m; k++) {
                        if (matrix[i][k] != -1) {
                            matrix[i][k] = 0;
                        }
                    }
                    for (int k = 0; k < n; k++) {
                        if (matrix[k][j] != -1) {
                            matrix[k][j] = 0;
                        }
                    }

                }

            }

        }
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void EfficientApproach(int[][] matrix) {

        int m = matrix.length;
        int n = matrix[0].length;
        int[] row = new int[m];
        int[] col = new int[n];
        Arrays.fill(row, -1);
        Arrays.fill(col, -1);

        for (int i = 0; i < m; i++) {

            for (int j = 0; j < n; j++) {

                if (matrix[i][j] == 0) {
                    row[i] = 0;
                    col[j] = 0;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (row[i] == 0 || col[j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }


        for (int i = 0; i < n; i++) {

            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
