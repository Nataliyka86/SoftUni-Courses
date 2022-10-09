package FirstStepsInCoding.Exercises;

import java.util.Scanner;

public class DepositCalculator_03 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //сума = депозирана сума  + срок на депозита * ((депозирана сума * годишен лихвен процент ) / 12)
        double deposit = Double.parseDouble(scanner.nextLine());
        int months = Integer.parseInt(scanner.nextLine());
        double percent = Double.parseDouble(scanner.nextLine());

        double total = deposit + months * ((deposit * percent/ 100) /12);

        System.out.println(total);


    }
}
