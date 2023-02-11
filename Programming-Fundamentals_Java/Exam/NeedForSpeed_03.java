package Exam;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class NeedForSpeed_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        LinkedHashMap<String, Integer> mileageMap = new LinkedHashMap<>();
        LinkedHashMap<String, Integer> fuelMap = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            String car = input.split("\\|")[0];
            int mileage = Integer.parseInt(input.split("\\|")[1]);
            int fuel = Integer.parseInt(input.split("\\|")[2]);
            mileageMap.put(car, mileage);
            fuelMap.put(car, fuel);
        }
        String command = scanner.nextLine();
        while (!command.equals("Stop")) {
            String[] commandArr = command.split(" : ");
            String carCommand = commandArr[1];
            switch (commandArr[0]) {
                case "Drive":
                    int distance = Integer.parseInt(commandArr[2]);
                    int fuelCommand = Integer.parseInt(commandArr[3]);
                    int currentFuel = fuelMap.get(carCommand);
                    if (fuelCommand > currentFuel) {
                        System.out.println("Not enough fuel to make that ride");
                    } else {
                        int currentMileage = mileageMap.get(carCommand) + distance;
                        currentFuel = fuelMap.get(carCommand) - fuelCommand;
                        mileageMap.put(carCommand, currentMileage);
                        fuelMap.put(carCommand, currentFuel);
                        System.out.printf("%s driven for %d kilometers. %d liters of fuel consumed.%n", carCommand, distance, fuelCommand);
                    }
                    if (mileageMap.get(carCommand) >= 100000) {
                        System.out.printf("Time to sell the %s!%n", carCommand);
                        mileageMap.remove(carCommand);
                        fuelMap.remove(carCommand);
                    }
                    break;
                case "Refuel":
                    int refuel = Integer.parseInt(commandArr[2]);
                    int currentRefuel = fuelMap.get(carCommand);
                    if (currentRefuel + refuel > 75) {
                        refuel = 75 - currentRefuel;
                        fuelMap.put(carCommand, 75);
                    } else {
                        currentFuel = currentRefuel + refuel;
                        fuelMap.put(carCommand, currentFuel);
                    }
                    System.out.printf("%s refueled with %d liters%n", carCommand, refuel);
                    break;
                case "Revert":
                    int kilometers = Integer.parseInt(commandArr[2]);
                    int currentKilometers = mileageMap.get(carCommand);
                    currentKilometers = currentKilometers - kilometers;
                    if (currentKilometers < 10000) {
                        mileageMap.put(carCommand, 10000);
                    } else {
                        mileageMap.put(carCommand, currentKilometers);
                        System.out.printf("%s mileage decreased by %d kilometers%n", carCommand, kilometers);
                    }
                    break;
            }
            command = scanner.nextLine();
        }
        for (Map.Entry<String, Integer> entry : mileageMap.entrySet()) {
            int getFuel = fuelMap.get(entry.getKey());
            System.out.printf("%s -> Mileage: %d kms, Fuel in the tank: %d lt.%n", entry.getKey(), entry.getValue(), getFuel);
        }

    }
}
