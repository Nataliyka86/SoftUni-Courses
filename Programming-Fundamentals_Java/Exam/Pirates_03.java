package Exam;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Pirates_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        LinkedHashMap<String, Integer> populationMap = new LinkedHashMap<>();
        LinkedHashMap<String, Integer> goldMap = new LinkedHashMap<>();
        while (!input.equals("Sail")) {
            String city = input.split("\\|\\|")[0];
            int population = Integer.parseInt(input.split("\\|\\|")[1]);
            int gold = Integer.parseInt(input.split("\\|\\|")[2]);
            if (populationMap.containsKey(city)) {
                int currentPopulation = populationMap.get(city);
                int currentGold = goldMap.get(city);
                populationMap.put(city, currentPopulation + population);
                goldMap.put(city, currentGold + gold);
            } else {
                populationMap.put(city, population);
                goldMap.put(city, gold);
            }
            input = scanner.nextLine();
        }
        String command = scanner.nextLine();
        while (!command.equals("End")) {
            String[] commandArr = command.split("=>");
            String town = commandArr[1];
            switch (commandArr[0]) {
                case "Plunder":
                    int people = Integer.parseInt(commandArr[2]);
                    int gold1 = Integer.parseInt(commandArr[3]);
                    System.out.printf("%s plundered! %d gold stolen, %d citizens killed.%n", town, gold1, people);
                    int currentPopulation1 = populationMap.get(town);
                    int currentGold1 = goldMap.get(town);
                    if (currentPopulation1 - people == 0 || currentGold1 - gold1 == 0) {
                        populationMap.remove(town);
                        goldMap.remove(town);
                        System.out.printf("%s has been wiped off the map!%n", town);
                    } else {
                        populationMap.put(town, currentPopulation1 - people);
                        goldMap.put(town, currentGold1 - gold1);
                    }
                    break;
                case "Prosper":
                    int gold2 = Integer.parseInt(commandArr[2]);
                    if (gold2 < 0) {
                        System.out.println("Gold added cannot be a negative number!");
                    } else {
                        goldMap.put(town, goldMap.get(town) + gold2);
                        System.out.printf("%d gold added to the city treasury. %s now has %d gold.%n", gold2, town, goldMap.get(town));
                    }
                    break;
            }
            command = scanner.nextLine();
        }
        if (populationMap.isEmpty()) {
            System.out.println("Ahoy, Captain! All targets have been plundered and destroyed!");
        } else {
            int count = populationMap.size();
            System.out.printf("Ahoy, Captain! There are %d wealthy settlements to go to:%n", count);
            for (Map.Entry<String, Integer> entry : populationMap.entrySet()) {
                System.out.printf("%s -> Population: %d citizens, Gold: %d kg%n", entry.getKey(), entry.getValue(), goldMap.get(entry.getKey()));
            }

        }
    }
}
