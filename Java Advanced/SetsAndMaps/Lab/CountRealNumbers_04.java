package SetsAndMaps.Lab;

import java.rmi.MarshalledObject;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountRealNumbers_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");
        Map<Double, Integer> map = new LinkedHashMap<>();

        for (String number : input) {
            double currentNumber = Double.parseDouble(number);
            if (map.containsKey(currentNumber)) {
                int count = map.get(currentNumber);
                map.put(currentNumber, count + 1);
            } else {
                map.put(currentNumber, 1);
            }
        }
        for (Double number : map.keySet()) {
            System.out.printf("%.1f -> %d%n", number, map.get(number));
        }
    }
}
