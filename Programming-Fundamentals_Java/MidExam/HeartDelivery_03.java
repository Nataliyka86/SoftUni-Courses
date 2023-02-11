package MidExam;

import java.util.Arrays;
import java.util.Scanner;

public class HeartDelivery_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] neighArr = Arrays.stream(scanner.nextLine().split("@")).mapToInt(Integer::parseInt).toArray();
        String command = scanner.nextLine();
        int index = 0;
        while (!command.equals("Love!")) {
            int length = Integer.parseInt(command.split(" ")[1]);
            index += length;
            if (index > neighArr.length - 1) {
                index = 0;
            }
            if (neighArr[index] == 0) {
                System.out.printf("Place %d already had Valentine's day.%n", index);
                command = scanner.nextLine();
                continue;
            }
            neighArr[index] -= 2;
            if (neighArr[index] == 0) {
                System.out.printf("Place %d has Valentine's day.%n", index);
            }
            command = scanner.nextLine();
        }
        System.out.printf("Cupid's last position was %d.%n", index);
        int counter = 0;
        for (int i = 0; i < neighArr.length; i++) {
            if (neighArr[i] == 0) {
                counter++;
            }
        }
        if (counter == neighArr.length) {
            System.out.println("Mission was successful.");
        } else {
            System.out.printf("Cupid has failed %d places.", neighArr.length - counter);
        }
    }
}
