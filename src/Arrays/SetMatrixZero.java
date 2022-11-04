package Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class SetMatrixZero {
    public static void main(String[] args) {

        int[][] arr = {
                {0,1,2,0},{3,4,5,2},{1,3,1,5}
        };
        //setZeroesNaive(arr);

        //EfficientApproach(arr);
        Best_Solution(arr);

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

    static void Best_Solution(int[][] matrix) {


        int row = matrix.length;
        int col = matrix[0].length;

        int col0 = 1;

        for (int i = 0; i < row; i++) {
            if (matrix[i][0] == 0) col0 = 0;
            for (int j = 1; j < col; j++)
                if (matrix[i][j] == 0)
                    matrix[i][0] = matrix[0][j] = 0;
        }


        for (int i = row - 1; i >= 0; i--) {
            for (int j = col - 1; j >= 1; j--) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0)
                    matrix[i][j] = 0;

            }
            if (col0 == 0) matrix[i][0] = 0;
        }


        for (int i = 0; i < row; i++) {

            for (int j = 0; j < col; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }


    }


}
