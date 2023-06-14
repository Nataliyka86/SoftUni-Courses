package Exams.Tasks;

import java.lang.reflect.Array;
import java.util.*;

public class ApocalypsePreparation_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] textileArr = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int[] medicamentArr = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        Deque<Integer> textileQueue = new ArrayDeque<>();
        Deque<Integer> medicamentStack = new ArrayDeque<>();

        Map<String, Integer> healMap = new TreeMap<>();

        for (int textile : textileArr) {
            textileQueue.offer(textile);
        }
        for (int medicament : medicamentArr) {
            medicamentStack.push(medicament);
        }

        while (!textileQueue.isEmpty() && !medicamentStack.isEmpty()) {
            int currentTextile = textileQueue.poll();
            int currentMedicament = medicamentStack.pop();
            int currentHeal = currentTextile + currentMedicament;
            if (currentHeal == 30) {
                if (!healMap.containsKey("Patch")) {
                    healMap.put("Patch", 1);
                } else {
                    healMap.put("Patch", healMap.get("Patch") + 1);
                }
            } else if (currentHeal == 40) {
                if (!healMap.containsKey("Bandage")) {
                    healMap.put("Bandage", 1);
                } else {
                    healMap.put("Bandage", healMap.get("Bandage") + 1);
                }
            } else if (currentHeal == 100) {
                if (!healMap.containsKey("MedKit")) {
                    healMap.put("MedKit", 1);
                } else {
                    healMap.put("MedKit", healMap.get("MedKit") + 1);
                }
            } else if (currentHeal > 100) {
                if (!healMap.containsKey("MedKit")) {
                    healMap.put("MedKit", 1);
                } else {
                    healMap.put("MedKit", healMap.get("MedKit") + 1);
                }
                int nextElement = medicamentStack.pop();
                medicamentStack.push(nextElement + currentHeal - 100);
            } else {
                medicamentStack.push(currentMedicament + 10);
            }
        }
        if (textileQueue.isEmpty() && medicamentStack.isEmpty()) {
            System.out.println("Textiles and medicaments are both empty.");
        } else if (textileQueue.isEmpty()) {
            System.out.println("Textiles are empty.");
        } else {
            System.out.println("Medicaments are empty.");
        }

        healMap.entrySet().stream().sorted((s1, s2) -> s2.getValue().compareTo(s1.getValue())).forEach(entry -> System.out.println(entry.getKey() + " - " + entry.getValue()));
        if (!medicamentStack.isEmpty()) {
            List<String> medicamentList = new ArrayList<>();
            for (int medicament : medicamentStack) {
                medicamentList.add(String.valueOf(medicament));
            }
            System.out.println("Medicaments left: " + String.join(", ", medicamentList));
        } else if (!textileQueue.isEmpty()) {
            List<String> textileList = new ArrayList<>();
            for (int textile : textileQueue) {
                textileList.add(String.valueOf(textile));
            }
            System.out.println("Textiles left: " + String.join(", ", textileList));
        }
    }
}
