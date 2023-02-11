package AssociativaArrays;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class AssociativeArrays_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] numArr = Arrays.stream(scanner.nextLine().split(" ")).mapToDouble(Double::parseDouble).toArray();
        TreeMap<Double, Integer> realMap = new TreeMap<>();

        for (int i = 0; i < numArr.length; i++) {
            if (!realMap.containsKey(numArr[i])) {
                realMap.put(numArr[i], 1);
            } else {
                int currentValue = realMap.get(numArr[i]) + 1;
                realMap.put(numArr[i], currentValue);
            }
        }
        for (Map.Entry<Double, Integer> entry : realMap.entrySet()) {
            System.out.printf("%.0f -> %d%n", entry.getKey(), entry.getValue());
        }

    }
}
