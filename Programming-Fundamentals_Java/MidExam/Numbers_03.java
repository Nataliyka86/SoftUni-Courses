package MidExam;

import java.util.*;
import java.util.stream.Collectors;

public class Numbers_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        List<Integer> greaterList = new ArrayList<>();
        int allSum = 0;
        int count = 0;

        for (int i = 0; i < numList.size(); i++) {
            allSum += numList.get(i);
        }
        double average = allSum * 1.00 / numList.size();
        for (int i = 0; i < numList.size(); i++) {
            if (numList.get(i) > average) {
                greaterList.add(numList.get(i));
            }
        }
        if (greaterList.size() == 0) {
            System.out.println("No");
        } else {
            Collections.sort(greaterList);
            Collections.reverse(greaterList);
            for (int i = 0; i <= 4; i++) {
                if (greaterList.size() - 1 < i) {
                    break;
                }
                System.out.print(greaterList.get(i) + " ");
            }
        }
    }
}
