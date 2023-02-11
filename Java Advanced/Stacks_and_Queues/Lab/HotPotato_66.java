package Stacks_and_Queues.Lab;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class HotPotato_66 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] inputArr = input.split("\\s+");
        int n = Integer.parseInt(scanner.nextLine());

        ArrayDeque<String> queue = new ArrayDeque<>();
        Collections.addAll(queue, inputArr);

        while (queue.size() > 1) {
            for (int i = 1; i <= n; i++) {
                if (i == n) {
                    System.out.println("Removed " + queue.poll());
                } else {
                    String child = queue.poll();
                    queue.offer(child);
                }
            }
        }
        System.out.println("Last is " + queue.peek());
    }
}
