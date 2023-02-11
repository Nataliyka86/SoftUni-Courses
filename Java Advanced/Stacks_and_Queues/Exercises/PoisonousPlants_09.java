package Stacks_and_Queues.Exercises;

import java.util.*;

public class PoisonousPlants_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Queue<Integer> queue = new ArrayDeque<>();
        List<Integer> numList = new ArrayList<>();
        int counter = 0;
        boolean stopDying = false;

        for (int i = 1; i <= n; i++) {
            int plants = scanner.nextInt();
            numList.add(plants);
        }
        while (!stopDying) {
            queue.offer(numList.get(0));
            for (int i = 1; i < numList.size(); i++) {
                if (numList.get(i) <= numList.get(i - 1)) {
                    queue.offer(numList.get(i));
                }
            }
            if (numList.size() == queue.size()) {
                stopDying = true;
                break;
            } else {
                counter++;
                numList.clear();
                while (!queue.isEmpty()) {
                    numList.add(queue.poll());
                }
            }
        }
        System.out.println(counter);
    }
}
