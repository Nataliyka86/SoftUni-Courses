package Arrays;

import java.util.Scanner;

public class ReverseArrayOfStrings_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] oldArr = scanner.nextLine().split(" ");

        for (int i = 0; i < oldArr.length / 2; i++) {
            String current = oldArr[i];
            oldArr[i] = oldArr[oldArr.length - 1 - i];
            oldArr[oldArr.length - 1 - i] = current;

        }
        System.out.println(String.join(" ", oldArr));
    }
}
