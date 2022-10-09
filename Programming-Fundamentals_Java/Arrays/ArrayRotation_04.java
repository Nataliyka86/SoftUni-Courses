package Arrays.Exercises;

import java.util.Scanner;

public class ArrayRotation_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] oldArr = scanner.nextLine().split(" ");
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++) {
            String[] newArr = new String[oldArr.length];
            newArr[newArr.length - 1] = oldArr[0];
            for (int j = 1; j <= oldArr.length - 1; j++) {
                newArr[j - 1] = oldArr[j];

            }
            oldArr = newArr;

        }
        System.out.println(String.join(" ", oldArr));

    }
}
