package Exams;

import java.util.Scanner;

public class ThroneConquering_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int energy = Integer.parseInt(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());

        String[][] matrix = new String[n][];

        int rowParis = -1;
        int colParis = -1;
        boolean isFound = false;

        for (int i = 0; i < n; i++) {
            matrix[i] = scanner.nextLine().split("");
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j].equals("P")) {
                    rowParis = i;
                    colParis = j;
                }
            }
        }
        String command = scanner.nextLine();
        while (energy > 0) {
            matrix[rowParis][colParis] = "-";
            String direction = command.split("\\s+")[0];
            int rowEnemy = Integer.parseInt(command.split("\\s+")[1]);
            int colEnemy = Integer.parseInt(command.split("\\s+")[2]);
            matrix[rowEnemy][colEnemy] = "S";
            switch (direction) {
                case "up":
                    if (rowParis - 1 >= 0) {
                        rowParis--;
                    }
                    break;
                case "down":
                    if (rowParis + 1 <= matrix.length - 1) {
                        rowParis++;
                    }
                    break;
                case "left":
                    if (colParis - 1 >= 0) {
                        colParis--;
                    }
                    break;
                case "right":
                    if (colParis + 1 <= matrix[0].length - 1) {
                        colParis++;
                    }
                    break;
            }
            energy--;
            if (matrix[rowParis][colParis].equals("S")) {
                energy -= 2;
                if (energy <= 0) {
                    matrix[rowParis][colParis] = "X";
                    break;
                } else {
                    matrix[rowParis][colParis] = "-";
                }
            } else if (matrix[rowParis][colParis].equals("H")) {
                matrix[rowParis][colParis] = "-";
                isFound = true;
                break;
            }
            if (energy <= 0) {
                matrix[rowParis][colParis] = "X";
                break;
            }

            matrix[rowParis][colParis] = "P";
            command = scanner.nextLine();
        }
        if (isFound) {
            System.out.printf("Paris has successfully abducted Helen! Energy left: %d%n", energy);
        } else {
            System.out.printf("Paris died at %d;%d.%n", rowParis, colParis);
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }
}
