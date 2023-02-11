package Arrays.Exercises;

import java.util.Scanner;

public class ArrayRotation_44 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] oldArr = scanner.nextLine().split(" ");
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++) {
            String firstElement = oldArr[0];
            for (int j = 0; j < oldArr.length - 1; j++) {
                oldArr[j] = oldArr[j + 1];
            }
            oldArr[oldArr.length - 1] = firstElement;
        }
        System.out.println(String.join(" ", oldArr));
    }
}
