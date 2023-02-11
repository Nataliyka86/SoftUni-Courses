package Exams;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class PastryShop_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] liquidInput = scanner.nextLine().split("\\s+");
        Deque<Integer> liquidQueue = new ArrayDeque<>();

        for (String liquid : liquidInput) {
            liquidQueue.offer(Integer.parseInt(liquid));
        }

        String[] ingredientsInput = scanner.nextLine().split("\\s+");
        Deque<Integer> ingredientStack = new ArrayDeque<>();

        for (String ingredient : ingredientsInput) {
            ingredientStack.push(Integer.parseInt(ingredient));
        }

        int biscuitCount = 0;
        int cakeCount = 0;
        int pastryCount = 0;
        int pieCount = 0;
        while (!liquidQueue.isEmpty() && !ingredientStack.isEmpty()) {
            int liquid = liquidQueue.poll();
            int ingredient = ingredientStack.pop();
            int possiblePastry = liquid + ingredient;

            switch (possiblePastry) {
                case 25:
                    biscuitCount++;
                    break;
                case 50:
                    cakeCount++;
                    break;
                case 75:
                    pastryCount++;
                    break;
                case 100:
                    pieCount++;
                    break;
                default:
                    ingredientStack.push(ingredient + 3);
            }

        }
        if (biscuitCount> 0 && cakeCount> 0 && pastryCount>0 &&pieCount>0){
            System.out.println("Great! You succeeded in cooking all the food!");
        } else {
            System.out.println("What a pity! You didn't have enough materials to cook everything.");
        }
        System.out.print("Liquids left: ");
        if (liquidQueue.isEmpty()){
            System.out.println("none");
        } else {
            System.out.println(liquidQueue.toString().replaceAll("[\\[\\]]", ""));
        }
        System.out.print("Ingredients left: ");
        if (ingredientStack.isEmpty()){
            System.out.println("none");
        } else {
            System.out.println(ingredientStack.toString().replaceAll("[\\[\\]]", ""));
        }
        System.out.printf("Biscuit: %d%n", biscuitCount);
        System.out.printf("Cake: %d%n", cakeCount);
        System.out.printf("Pie: %d%n", pieCount);
        System.out.printf("Pastry: %d%n", pastryCount);
    }
}
