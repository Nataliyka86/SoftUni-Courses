package Exams;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RallyRacing_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String carNumber = scanner.nextLine();
        int km = 0;

        String[][] trace = new String[n][n];
        fillMatrix(trace, scanner);

        int currentRow = 0;
        int currentCol = 0;

        List<Integer> tunnelList = new ArrayList<>();
        findTunnels(trace, tunnelList);

        String direction = scanner.nextLine();

        while (!direction.equals("End")) {
            switch (direction) {
                case "left":
                    currentCol--;
                    break;
                case "right":
                    currentCol++;
                    break;
                case "up":
                    currentRow--;
                    break;
                case "down":
                    currentRow++;
                    break;
            }
            String movedPlace = trace[currentRow][currentCol];
            if (".".equals(movedPlace)) {
                km += 10;
            } else if ("F".equals(movedPlace)) {
                System.out.printf("Racing car %s finished the stage!%n", carNumber);
                km += 10;
                break;
            } else if (movedPlace.equals("T")) {
                currentRow = tunnelList.get(2);
                currentCol = tunnelList.get(3);
                km += 30;
                trace[tunnelList.get(0)][tunnelList.get(1)] = ".";
                trace[tunnelList.get(2)][tunnelList.get(3)] = ".";
            }
            direction = scanner.nextLine();
        }
        if (direction.equals("End")) {
            System.out.printf("Racing car %s DNF.%n", carNumber);

        }
        System.out.printf("Distance covered %d km.%n", km);
        trace[currentRow][currentCol] = "C";
        printMatrix(trace);
    }

    private static void findTunnels(String[][] trace, List<Integer> tunnelList) {
        for (int i = 0; i < trace.length; i++) {
            for (int j = 0; j < trace.length; j++) {
                if (trace[i][j].equals("T")) {
                    tunnelList.add(i);
                    tunnelList.add(j);
                }
            }
        }

    }

    private static void fillMatrix(String[][] matrix, Scanner scanner) {
        for (int i = 0; i < matrix.length; i++) {
            matrix[i] = scanner.nextLine().split("\\s+");

        }
    }


    private static void printMatrix(String[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }
}

