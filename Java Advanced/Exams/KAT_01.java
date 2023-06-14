package Exams;

import java.util.*;

public class KAT_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] licenseArr = Arrays.stream(scanner.nextLine().split(",\\s+")).mapToInt(Integer::parseInt).toArray();
        int[] carsArr = Arrays.stream(scanner.nextLine().split(",\\s+")).mapToInt(Integer::parseInt).toArray();

        Deque<Integer> licenseQueue = new ArrayDeque<>();
        Deque<Integer> carsStack = new ArrayDeque<>();

        int countDays = 0;
        int countRegisterCars = 0;

        for (int license : licenseArr) {
            licenseQueue.offer(license);
        }

        for (int car : carsArr) {
            carsStack.push(car);
        }

        while (!licenseQueue.isEmpty() && !carsStack.isEmpty()) {
            int currentPlates = licenseQueue.poll();
            int currentCars = carsStack.pop();
            if (currentPlates == currentCars * 2) {
                countRegisterCars += currentCars;
            } else if (currentPlates < currentCars * 2) {
                countRegisterCars += currentPlates / 2;
                carsStack.push(currentCars - currentPlates / 2);
            } else {
                countRegisterCars += currentCars;
                licenseQueue.offer(currentPlates - currentCars * 2);
            }
            countDays++;
        }
        System.out.printf("%d cars were registered for %d days!%n", countRegisterCars, countDays);
        if (licenseQueue.isEmpty() && carsStack.isEmpty()) {
            System.out.println("Good job! There is no queue in front of the KAT!");
        } else if (!licenseQueue.isEmpty()) {
            int countPlates = 0;
            for (int plate : licenseQueue) {
                countPlates += plate;
            }
            System.out.printf("%d license plates remain!%n", countPlates);
        } else {
            int countCars = 0;
            for (int car : carsStack) {
                countCars += car;
            }
            System.out.printf("%d cars remain without license plates!%n", countCars);
        }
    }
}
