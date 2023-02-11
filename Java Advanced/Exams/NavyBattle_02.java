package Exams;

import java.util.Scanner;

public class NavyBattle_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        String[][] matrix = new String[n][n];

        for (int i = 0; i < n; i++) {
            matrix[i] = scanner.nextLine().split("");
        }
        int submarineRow = -1;
        int submarineCol = -1;
        int countHits = 0;
        int countCruiser = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j].equals("S")) {
                    submarineRow = i;
                    submarineCol = j;
                    break;
                }
            }
        }
        String command = scanner.nextLine();
        while (true) {
            matrix[submarineRow][submarineCol] = "-";
            if (command.equals("up")) {
                submarineRow--;
            } else if (command.equals("down")) {
                submarineRow++;
            } else if (command.equals("left")) {
                submarineCol--;
            } else if (command.equals("right")) {
                submarineCol++;
            }
            String submarinePosition = matrix[submarineRow][submarineCol];
            if (submarinePosition.equals("-")) {
                matrix[submarineRow][submarineCol] = "S";
            } else if (submarinePosition.equals("*")) {
                matrix[submarineRow][submarineCol] = "S";
                countHits++;
                if (countHits == 3) {
                    System.out.printf("Mission failed, U-9 disappeared! Last known coordinates [%d, %d]!%n", submarineRow, submarineCol);
                    break;
                }
            } else if (submarinePosition.equals("C")) {
                matrix[submarineRow][submarineCol] = "S";
                countCruiser++;
                if (countCruiser == 3) {
                    System.out.println("Mission accomplished, U-9 has destroyed all battle cruisers of the enemy!");
                    break;
                }
            }
            command = scanner.nextLine();
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }
}
