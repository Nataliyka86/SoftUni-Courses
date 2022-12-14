package FirstStepsInCoding.Exercises;

import java.util.Scanner;

public class BasketballEquipment_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int fee = Integer.parseInt(scanner.nextLine());

        //•	Баскетболни кецове – цената им е 40% по-малка от таксата за една година
        //•	Баскетболен екип – цената му е 20% по-евтина от тази на кецовете
        //•	Баскетболна топка – цената ѝ е 1 / 4 от цената на баскетболния екип
        //•	Баскетболни аксесоари – цената им е 1 / 5 от цената на баскетболната топка

        double sneakers = fee - (fee * 40 /100.00);
        double equipment = sneakers - (sneakers * 20/100);
        double ball = equipment / 4;
        double accessories = ball /5;

        double totalFee = fee + sneakers + equipment + accessories + ball;

        System.out.println(totalFee);
        }

    }

