package Methods.More;

import java.util.Scanner;

public class TribonacciSequence_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int[] arrayNew = new int[n];
        arrayNew[0] = 1;
        arrayNew[1] = 1;
        arrayNew[2] = 2;
        int index = 3;
        System.out.printf("%d ", arrayNew[0]);
        System.out.printf("%d ", arrayNew[1]);
        System.out.printf("%d ", arrayNew[2]);
        while (index <= n - 1) {
            for (int i = 3; i <= Integer.MAX_VALUE; i++) {
                arrayNew[index] = i;
                if (arrayNew[index] == arrayNew[index - 1] + arrayNew[index - 2] + arrayNew[index - 3]) {
                    System.out.printf("%d ", arrayNew[index]);
                    index++;
                }
                if (index == n) {
                    break;
                }
            }

        }
    }

}
