package Exams;

import java.util.*;

public class Bombs_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] bombEffect = Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        int[] bombCasing = Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        Deque<Integer> effectQueue = new ArrayDeque<>();
        Deque<Integer> casingStack = new ArrayDeque<>();
        int countDatura = 0;
        int countCherry = 0;
        int countSmoke = 0;

        for (int i = 0; i < bombEffect.length; i++) {
            effectQueue.offer(bombEffect[i]);
        }
        for (int i = 0; i < bombCasing.length; i++) {
            casingStack.push(bombCasing[i]);
        }

        while (!effectQueue.isEmpty() && !casingStack.isEmpty()) {
            int currentValue = effectQueue.peek() + casingStack.pop();
            if (currentValue == 40) {
                effectQueue.poll();
                countDatura++;
            } else if (currentValue == 60) {
                effectQueue.poll();
                countCherry++;
            } else if (currentValue == 120) {
                effectQueue.poll();
                countSmoke++;
            } else {
                casingStack.push(currentValue - effectQueue.peek() - 5);
            }
            if (countCherry >= 3 && countDatura >= 3 && countSmoke >= 3) {
                break;
            }
        }
        if (countCherry >= 3 && countDatura >= 3 && countSmoke >= 3) {
            System.out.println("Bene! You have successfully filled the bomb pouch!");
        } else {
            System.out.println("You don't have enough materials to fill the bomb pouch.");
        }
        if (effectQueue.isEmpty()) {
            System.out.println("Bomb Effects: empty");
        } else {
            List<String> effectList = new ArrayList<>();
            while (!effectQueue.isEmpty()) {
                int currentEffect = effectQueue.poll();
                effectList.add(String.valueOf(currentEffect));
            }
            System.out.print("Bomb Effects: ");
            System.out.print(String.join(", ", effectList));
            System.out.println();
        }
        if (casingStack.isEmpty()) {
            System.out.println("Bomb Casings: empty");
        } else {
            List<String> casingList = new ArrayList<>();
            while (!casingStack.isEmpty()) {
                int currentCasing = casingStack.pop();
                casingList.add(String.valueOf(currentCasing));
            }
            System.out.print("Bomb Casings: ");
            System.out.print(String.join(", ", casingList));
            System.out.println();
        }
        System.out.printf("Cherry Bombs: %d%n", countCherry);
        System.out.printf("Datura Bombs: %d%n", countDatura);
        System.out.printf("Smoke Decoy Bombs: %d%n", countSmoke);
    }

}
