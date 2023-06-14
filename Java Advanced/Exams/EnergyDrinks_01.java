package Exams;

import java.util.*;

public class EnergyDrinks_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] caffeineArr = Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        int[] energyDrinksArr = Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();

        Deque<Integer> caffeineStack = new ArrayDeque<>();
        Deque<Integer> energyQueue = new ArrayDeque<>();

        for (int caffeine : caffeineArr) {
            caffeineStack.push(caffeine);
        }

        for (int energy : energyDrinksArr) {
            energyQueue.offer(energy);
        }

        int totalDrink = 0;

        while (!caffeineStack.isEmpty() && !energyQueue.isEmpty()) {
            int currentEnergy = energyQueue.poll();
            int currentCaffeine = caffeineStack.pop();
            int currentDrink = currentEnergy * currentCaffeine;
            if (currentDrink <= 300 - totalDrink) {
                totalDrink += currentDrink;
            } else {
                energyQueue.offer(currentEnergy);
                if (totalDrink >= 30) {
                    totalDrink -= 30;
                }
            }
        }
        if (energyQueue.isEmpty()) {
            System.out.println("At least Stamat wasn't exceeding the maximum caffeine.");
        } else {
            System.out.print("Drinks left: ");
            List<String> drinks = new ArrayList<>();
            while (!energyQueue.isEmpty()) {
                drinks.add(energyQueue.poll().toString());
            }
            System.out.println(String.join(", ", drinks));
        }
        System.out.printf("Stamat is going to sleep with %d mg caffeine.%n", totalDrink);
    }
}
