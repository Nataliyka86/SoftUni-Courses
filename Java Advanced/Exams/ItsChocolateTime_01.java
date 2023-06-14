package Exams;

import java.util.*;

public class ItsChocolateTime_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] milkValues = Arrays.stream(scanner.nextLine().split("\\s+")).mapToDouble(Double::parseDouble).toArray();
        double[] cacaoValues = Arrays.stream(scanner.nextLine().split("\\s+")).mapToDouble(Double::parseDouble).toArray();

        Deque<Double> milkQueue = new ArrayDeque<>();
        Deque<Double> cacaoStack = new ArrayDeque<>();
        Map<String, Integer> chocolateMap = new TreeMap<>();

        for (double milk : milkValues) {
            milkQueue.offer(milk);
        }
        for (double cacao : cacaoValues) {
            cacaoStack.push(cacao);
        }
        while (!milkQueue.isEmpty() && !cacaoStack.isEmpty()) {
            double currentMilk = milkQueue.poll();
            double currentCacao = cacaoStack.pop();
            double cacaoPercentage = (currentCacao / (currentCacao + currentMilk)) * 100;
            if (cacaoPercentage == 30.00) {
                if (!chocolateMap.containsKey("Milk Chocolate")) {
                    chocolateMap.put("Milk Chocolate", 1);
                } else {
                    chocolateMap.put("Milk Chocolate", chocolateMap.get("Milk Chocolate") + 1);
                }
            } else if (cacaoPercentage == 50) {
                if (!chocolateMap.containsKey("Dark Chocolate")) {
                    chocolateMap.put("Dark Chocolate", 1);
                } else {
                    chocolateMap.put("Dark Chocolate", chocolateMap.get("Dark Chocolate") + 1);
                }
            } else if (cacaoPercentage == 100) {
                if (!chocolateMap.containsKey("Baking Chocolate")) {
                    chocolateMap.put("Baking Chocolate", 1);
                } else {
                    chocolateMap.put("Baking Chocolate", chocolateMap.get("Baking Chocolate") + 1);
                }
            } else {
                milkQueue.offer(currentMilk + 10);
            }

        }
        if (chocolateMap.size() == 3) {
            System.out.println("It’s a Chocolate Time. All chocolate types are prepared.");
        } else {
            System.out.println("Sorry, but you didn't succeed to prepare all types of chocolates.");
        }
        chocolateMap.entrySet().forEach(p -> System.out.println(" # " + p.getKey() + " --> " + p.getValue()));
    }
}
