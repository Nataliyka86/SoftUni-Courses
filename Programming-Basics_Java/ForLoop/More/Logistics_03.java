package ForLoop.More;

import java.util.Scanner;

public class Logistics_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //•	На първия ред – броя на товарите за превоз – цяло число в интервала [1...1000]
        //•	За всеки един товар на отделен ред – тонажа на товара – цяло число в интервала [1...1000]

        int n = Integer.parseInt(scanner.nextLine());
        int allCargos = 0;
        double minibus = 0.00;
        double truck = 0.00;
        double train = 0.00;

        for (int i = 1; i <= n; i++) {
            int cargo = Integer.parseInt(scanner.nextLine());
            allCargos += cargo;
            if (cargo <= 3) {
                minibus += cargo;
            } else if (cargo <= 11) {
                truck += cargo;
            } else {
                train += cargo;
            }
        }
        double averagePrice = (minibus * 200 + truck * 175 + train * 120) / allCargos;
        System.out.printf("%.2f%n", averagePrice);
        System.out.printf("%.2f%%%n", minibus / allCargos * 100);
        System.out.printf("%.2f%%%n", truck / allCargos * 100);
        System.out.printf("%.2f%%%n", train / allCargos * 100);

    }
}
