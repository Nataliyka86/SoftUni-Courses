package Message;

import ClassesObjects.Exercises.Message;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        ClassesObjects.Exercises.Message message = new Message();
        for (int i = 1; i <= n; i++) {
            String output = message.randomMessage();
            System.out.println(output);
        }
    }
}
