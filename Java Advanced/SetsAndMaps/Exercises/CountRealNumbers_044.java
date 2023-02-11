package Advanced.SetAndMap;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountRealNumbers_044 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");
        Map<Double, Integer> numberMap = new LinkedHashMap<>();

        for (int i = 0; i < input.length; i++) {
            Double currentNumber = Double.parseDouble(input[i]);
            if (!numberMap.containsKey(currentNumber)) {
                numberMap.put(currentNumber, 1);
            } else {
                numberMap.put(currentNumber, numberMap.get(currentNumber) + 1);
            }
        }
        for (Map.Entry<Double, Integer> entry : numberMap.entrySet()) {
            System.out.printf("%.1f -> %d%n", entry.getKey(), entry.getValue());
        }
    }
}
