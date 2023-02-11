package MultidimensionalArrays.Exercises;

import java.util.Scanner;

public class DiagonalDifference_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int[][] matrix = new int[n][n];

        fillMatrix(matrix, scanner);
        int sumPrimary = getSumElementOnPrimaryDiagonal(matrix);
        int sumSecondary = getSumElementOnSecondaryDiagonal(matrix);

        System.out.println(Math.abs(sumPrimary - sumSecondary));

    }

    private static int getSumElementOnSecondaryDiagonal(int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                int currentElement = matrix[i][j];
                if (j == matrix.length - i - 1) {
                    sum += currentElement;
                }
            }
        }
        return sum;
    }

    private static int getSumElementOnPrimaryDiagonal(int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (i == j) {
                    sum += matrix[i][j];
                }
            }
        }
        return sum;
    }


    private static void fillMatrix(int[][] matrix, Scanner scanner) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
    }
}
