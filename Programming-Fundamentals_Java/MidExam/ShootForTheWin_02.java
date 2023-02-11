package MidExam;

import java.util.Arrays;
import java.util.Scanner;

public class ShootForTheWin_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] targetArr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        String command = scanner.nextLine();
        int count = 0;

        while (!command.equals("End")) {
            int index = Integer.parseInt(command);
            if (index < 0 || index > targetArr.length - 1) {
                command = scanner.nextLine();
                continue;
            }
            if (index >= 0 && index <= targetArr.length - 1) {
                int currentTarget = targetArr[index];
                targetArr[index] = -1;
                for (int i = 0; i < index; i++) {
                    if (targetArr[i] == -1) {
                        continue;
                    }
                    if (targetArr[i] > currentTarget) {
                        targetArr[i] -= currentTarget;
                    } else {
                        targetArr[i] += currentTarget;
                    }
                }
                if (index < targetArr.length - 1) {
                    for (int j = index + 1; j < targetArr.length; j++) {
                        if (targetArr[j] == -1) {
                            continue;
                        }
                        if (targetArr[j] > currentTarget) {
                            targetArr[j] -= currentTarget;
                        } else {
                            targetArr[j] += currentTarget;
                        }
                    }
                }
            }
            count++;
            command = scanner.nextLine();
        }
        System.out.printf("Shot targets: %d -> ", count);
        for (int item : targetArr) {
            System.out.print(item + " ");
        }
    }
}
