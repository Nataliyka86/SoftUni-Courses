package Exam;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class HeroesOfCodeAndLogic_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        LinkedHashMap<String, Integer> hitMap = new LinkedHashMap<>();
        LinkedHashMap<String, Integer> manaMap = new LinkedHashMap<>();

        for (int i = 1; i <= n; i++) {
            String input = scanner.nextLine();
            String heroName = input.split(" ")[0];
            int hitPoints = Integer.parseInt(input.split(" ")[1]);
            int manaPoints = Integer.parseInt(input.split(" ")[2]);
            hitMap.put(heroName, hitPoints);
            manaMap.put(heroName, manaPoints);
        }
        String command = scanner.nextLine();
        while (!command.equals("End")) {
            String[] commandArr = command.split(" - ");
            switch (commandArr[0]) {
                case "CastSpell":
                    String heroName2 = commandArr[1];
                    int neededMana = Integer.parseInt(commandArr[2]);
                    String spellName = commandArr[3];
                    if (manaMap.get(heroName2) >= neededMana) {
                        int manaPointsLeft = manaMap.get(heroName2) - neededMana;
                        manaMap.put(heroName2, manaPointsLeft);
                        System.out.printf("%s has successfully cast %s and now has %d MP!%n", heroName2, spellName, manaPointsLeft);
                    } else {
                        System.out.printf("%s does not have enough MP to cast %s!%n", heroName2, spellName);
                    }
                    break;
                case "TakeDamage":
                    String heroName3 = commandArr[1];
                    int damage = Integer.parseInt(commandArr[2]);
                    String attacker = commandArr[3];
                    int reduceHit = hitMap.get(heroName3) - damage;
                    if (reduceHit > 0) {
                        hitMap.put(heroName3, reduceHit);
                        System.out.printf("%s was hit for %d HP by %s and now has %d HP left!%n", heroName3, damage, attacker, reduceHit);
                    } else {
                        hitMap.remove(heroName3);
                        manaMap.remove(heroName3);
                        System.out.printf("%s has been killed by %s!%n", heroName3, attacker);
                    }
                    break;
                case "Recharge":
                    String heroName4 = commandArr[1];
                    int amountMP = Integer.parseInt(commandArr[2]);
                    int newMana = manaMap.get(heroName4) + amountMP;
                    if (newMana > 200) {
                        amountMP = 200 - manaMap.get(heroName4);
                        manaMap.put(heroName4, 200);
                    } else {
                        manaMap.put(heroName4, newMana);
                    }
                    System.out.printf("%s recharged for %d MP!%n", heroName4, amountMP);
                    break;
                case "Heal":
                    String heroName5 = commandArr[1];
                    int amountHP = Integer.parseInt(commandArr[2]);
                    int newHit = hitMap.get(heroName5) + amountHP;
                    if (newHit > 100) {
                        amountHP = 100 - hitMap.get(heroName5);
                        hitMap.put(heroName5, 100);
                    } else {
                        hitMap.put(heroName5, newHit);
                    }
                    System.out.printf("%s healed for %d HP!%n", heroName5, amountHP);
                    break;
            }
            command = scanner.nextLine();
        }
        for (Map.Entry<String, Integer> entry : hitMap.entrySet()) {
            System.out.println(entry.getKey());
            System.out.printf("  HP: %d%n", entry.getValue());
            int mP = manaMap.get(entry.getKey());
            System.out.printf("  MP: %d%n", mP);
        }
    }
}
