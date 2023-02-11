package Lists.Exercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BombNumbers_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        int[] specialArr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int specialNum = specialArr[0];
        int power = specialArr[1];
        int sum = 0;

        while (numList.contains(specialNum)) {
            int elementIndex = numList.indexOf(specialNum);
            int left = Math.max(0, elementIndex - power);
            int right = Math.min(elementIndex + power, numList.size() - 1);
            for (int i = right; i >= left; i--) {
                numList.remove(i);
            }
        }
        for (int i = 0; i < numList.size(); i++) {
            sum += numList.get(i);
        }
        System.out.println(sum);
    }
}
