package Advanced.Exams;

import java.util.Scanner;

public class StickyFingers_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String[] directionsArr = scanner.nextLine().split(",");

        String[][] matrix = new String[n][n];
        fillMatrix(matrix, scanner);

        int rowThief = -1;
        int colThief = -1;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j].equals("D")) {
                    rowThief = i;
                    colThief = j;
                    break;
                }
            }
        }
        int totalStolenMoney = 0;
        for (String direction : directionsArr) {
            switch (direction) {
                case "left":
                    if (colThief - 1 < 0) {
                        System.out.println("You cannot leave the town, there is police outside!");
                    } else {
                        matrix[rowThief][colThief] = "+";
                        colThief--;
                    }
                    break;
                case "right":
                    if (colThief + 1 > n - 1) {
                        System.out.println("You cannot leave the town, there is police outside!");
                    } else {
                        matrix[rowThief][colThief] = "+";
                        colThief++;
                    }
                    break;
                case "up":
                    if (rowThief - 1 < 0) {
                        System.out.println("You cannot leave the town, there is police outside!");
                    } else {
                        matrix[rowThief][colThief] = "+";
                        rowThief--;
                    }
                    break;
                case "down":
                    if (rowThief + 1 > n - 1) {
                        System.out.println("You cannot leave the town, there is police outside!");
                    } else {
                        matrix[rowThief][colThief] = "+";
                        rowThief++;
                    }
                    break;
            }
            String currentPosition = matrix[rowThief][colThief];
            if (currentPosition.equals("$")) {
                int stolenMoney = rowThief * colThief;
                System.out.printf("You successfully stole %d$.%n", stolenMoney);
                totalStolenMoney += stolenMoney;
                matrix[rowThief][colThief] = "D";
            } else if (currentPosition.equals("P")) {
                System.out.printf("You got caught with %d$, and you are going to jail.%n", totalStolenMoney);
                matrix[rowThief][colThief] = "#";
                printMatrix(matrix);
                return;
            } else if (currentPosition.equals("+")) {
                matrix[rowThief][colThief] = "D";
            }
        }
        System.out.printf("Your last theft has finished successfully with %d$ in your pocket.%n", totalStolenMoney);
        printMatrix(matrix);
    }

    private static void fillMatrix(String[][] matrix, Scanner scanner) {
        for (int i = 0; i < matrix.length; i++) {
            matrix[i] = scanner.nextLine().split("\\s+");
        }
    }

    private static void printMatrix(String[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
