package Exams;

import java.util.*;

public class ClimbThePeaks_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] portionArr = Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        int[] staminaArr = Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();

        int days = 0;
        List<String> peakList = new ArrayList<>();
        Deque<Integer> portionStack = new ArrayDeque<>();
        Deque<Integer> staminaQueue = new ArrayDeque<>();
        Peak peak1 = new Peak("Vihren", 80);
        Peak peak2 = new Peak("Kutelo", 90);
        Peak peak3 = new Peak("Banski Suhodol", 100);
        Peak peak4 = new Peak("Polezhan", 60);
        Peak peak5 = new Peak("Kamenitza", 70);
        List<Peak> availablePeakList = new ArrayList<>();
        availablePeakList.add(peak1);
        availablePeakList.add(peak2);
        availablePeakList.add(peak3);
        availablePeakList.add(peak4);
        availablePeakList.add(peak5);

        for (int portion : portionArr) {
            portionStack.push(portion);
        }
        for (int stamina : staminaArr) {
            staminaQueue.offer(stamina);
        }


        while (days < 7) {
            int dailySum = portionStack.pop() + staminaQueue.poll();
            if (dailySum >= availablePeakList.get(0).getDifficulty()) {
                peakList.add(availablePeakList.get(0).getName());
                availablePeakList.remove(0);
            }
            days++;
            if (availablePeakList.isEmpty()) {
                break;
            }

        }
        if (availablePeakList.isEmpty()) {
            System.out.println("Alex did it! He climbed all top five Pirin peaks in one week -> @FIVEinAWEEK");
        } else {
            System.out.println("Alex failed! He has to organize his journey better next time -> @PIRINWINS");
        }
        if (!peakList.isEmpty()) {
            System.out.println("Conquered peaks:");
            peakList.forEach(p -> System.out.println(p));
        }
    }

    private static class Peak {
        private String name;
        private int difficulty;

        public Peak(String name, int difficulty) {
            this.name = name;
            this.difficulty = difficulty;
        }

        public String getName() {
            return name;
        }

        public int getDifficulty() {
            return difficulty;
        }
    }
}
