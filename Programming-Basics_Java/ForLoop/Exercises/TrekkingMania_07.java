package ForLoop.Exercises;

import java.util.Scanner;

public class TrekkingMania_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //•	На първия ред – броя на групите от катерачи – цяло число в интервала [1...1000]
        //•	За всяка една група на отделен ред – броя на хората в групата – цяло число в интервала [1...1000]
        int n = Integer.parseInt(scanner.nextLine());
        int allPeople = 0;
        int musala = 0;
        int monblan = 0;
        int kilimandzaro = 0;
        int k2 = 0;
        int everest = 0;

        for (int i = 1; i <= n; i++) {
            int people = Integer.parseInt(scanner.nextLine());
            allPeople += people;
            if (people <= 5) {
                musala += people;
            } else if (people <= 12) {
                monblan += people;
            } else if (people <= 25) {
                kilimandzaro += people;
            } else if (people <= 40) {
                k2 += people;
            } else {
                everest += people;
            }
        }
        double percentMusala = musala * 1.00 / allPeople * 100;
        double percentMonblan = monblan * 1.00 / allPeople * 100;
        double percentKilimandzaro = kilimandzaro * 1.00 / allPeople * 100;
        double percentK2 = k2 * 1.00 / allPeople * 100;
        double percentEverest = everest * 1.00 / allPeople * 100;

        System.out.printf("%.2f%%%n", percentMusala);
        System.out.printf("%.2f%%%n", percentMonblan);
        System.out.printf("%.2f%%%n", percentKilimandzaro);
        System.out.printf("%.2f%%%n", percentK2);
        System.out.printf("%.2f%%%n", percentEverest);


    }
}
