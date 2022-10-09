package ForLoop.More;

import java.util.Scanner;

public class BackToThePast_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //•	Наследените пари – реално число в интервала [1.00 ... 1 000 000.00]
        //•	Годината, до която трябва да живее (включително) – цяло число в интервала [1801 ... 1900]

        double heritage = Double.parseDouble(scanner.nextLine());
        int year = Integer.parseInt(scanner.nextLine());
        int age = 17;

        for (int i = 1800; i <= year; i++) {
            age += 1;
            if (i % 2 == 0) {
                heritage -= 12000;
            } else {

                heritage -= (12000 + age * 50);
            }
        }
        if (heritage >= 0) {
            System.out.printf("Yes! He will live a carefree life and will have %.2f dollars left.", heritage);
        } else {
            System.out.printf("He will need %.2f dollars to survive.", Math.abs(heritage));
        }
    }
}
