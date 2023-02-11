package Exam;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PlantDiscovery_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Map<String, Integer> plantMap = new HashMap<>();
        Map<String, Double> rateMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            String[] tokenArr = input.split("<->");
            String plant = tokenArr[0];
            int rarity = Integer.parseInt(tokenArr[1]);
            rateMap.put(plant, 0.0);
            plantMap.put(plant, rarity);
        }
        String input = scanner.nextLine();
        while (!input.equals("Exhibition")) {
            String[] inputArr = input.split("[: -]+");
            String command = inputArr[0];
            String plant = inputArr[1];

            if (!plantMap.containsKey(plant)) {
                System.out.println("error");
            } else {
                switch (command) {
                    case "Rate":
                        double rating = Double.parseDouble(inputArr[2]);
                        if (rateMap.get(plant) == 0) {
                            rateMap.put(plant, rating);
                        } else {
                            double newRate = (rateMap.get(plant) + rating) / 2;
                            rateMap.put(plant, newRate);
                        }
                        break;
                    case "Update":
                        int rarity = Integer.parseInt(inputArr[2]);
                        plantMap.put(plant, rarity);
                        break;
                    case "Reset":
                        rateMap.put(plant, 0.0);
                        break;
                }
            }
            input = scanner.nextLine();
        }
        System.out.println("Plants for the exhibition:");
        for (Map.Entry<String, Integer> entry : plantMap.entrySet()) {
            System.out.printf("- %s; Rarity: %d; Rating: %.2f%n", entry.getKey(), entry.getValue(), rateMap.get(entry.getKey()));
        }
    }
}
