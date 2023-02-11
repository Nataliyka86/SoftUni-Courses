package AssociativaArrays.Exercises;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Orders_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        LinkedHashMap<String, Integer> quantityMap = new LinkedHashMap<>();
        LinkedHashMap<String, Double> priceMap = new LinkedHashMap<>();

        while (!input.equals("buy")) {
            String product = input.split(" ")[0];
            double price = Double.parseDouble(input.split(" ")[1]);
            int quantity = Integer.parseInt(input.split(" ")[2]);
            if (!quantityMap.containsKey(product)) {
                quantityMap.put(product, quantity);
            } else {
                int currentQuantity = quantityMap.get(product);
                quantityMap.put(product, currentQuantity + quantity);
            }

            priceMap.put(product, price);
            input = scanner.nextLine();
        }
        for (Map.Entry<String, Double> entry : priceMap.entrySet()) {
            String product = entry.getKey();
            double finalSum = entry.getValue() * quantityMap.get(product);
            System.out.printf("%s -> %.2f%n", product, finalSum);
        }

    }
}
