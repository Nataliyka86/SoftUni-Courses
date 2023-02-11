package MultidimensionalArrays.Lab;

import java.util.Scanner;

public class PositionsOf_022 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputArr = scanner.nextLine().split("\\s+");
        int row = Integer.parseInt(inputArr[0]);
        int col = Integer.parseInt(inputArr[1]);
        boolean isFound = false;

        int[][] matrix = new int[row][col];

        for (int i = 0; i < row; i++) {
            String[] input = scanner.nextLine().split("\\s+");
            for (int j = 0; j < col; j++) {
                matrix[i][j] = Integer.parseInt(input[j]);
            }
        }
        int number = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (matrix[i][j] == number) {
                    System.out.println(i + " " + j);
                    isFound = true;
                }
            }
        }
        if (!isFound) {
            System.out.println("not found");
        }
    }
}
