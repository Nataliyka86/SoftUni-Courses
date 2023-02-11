package MultidimensionalArrays.Lab;

import java.util.Scanner;

public class SumMatrixElements_044 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(", ");
        int row = Integer.parseInt(input[0]);
        int col = Integer.parseInt(input[1]);

        int[][] matrix = new int[row][col];
        int sum = 0;

        for (int i = 0; i < row; i++) {
            String[] tokens = scanner.nextLine().split(", ");
            for (int j = 0; j < col; j++) {
                matrix[i][j] = Integer.parseInt(tokens[j]);
                sum += matrix[i][j];
            }
        }
        System.out.println(row);
        System.out.println(col);
        System.out.println(sum);
    }
}
