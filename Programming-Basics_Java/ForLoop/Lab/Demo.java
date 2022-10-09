package ForLoop.Lab;

import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());
        int n3 = Integer.parseInt(scanner.nextLine());
        int firstNum = 0;
        int secondNum = 0;
        int thirdNum = 0;

        for (int i = 1; i <= n1; i++) {
            if (i % 2 == 0) {
                firstNum = i;
            } else {
                continue;
            }
            for (int j = 2; j <= n2; j++) {
                for (int k = 2; k <= j; k++) {
                    if (j % k != 0) {
                        secondNum = j;
                    } else {
                        continue;
                    }
                }
                for (int l = 1; l <= n3; l++) {
                    if (l % 2 == 0) {
                        thirdNum = l;
                    } else {
                        continue;
                    }
                    System.out.println(i + " " + secondNum + " " + l + " ");
                }
            }
        }
    }
}