package FirstStepInCoding.Lab;

import java.util.Scanner;

public class YardGreening_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        //1.	Кв. метри, които ще бъдат озеленени – реално число в интервала [0.00 … 10000.00]
        double quatermeters = Double.parseDouble(scanner.nextLine());

        double totalPriceWithoutDisc = quatermeters * 7.61;
        double discount = totalPriceWithoutDisc * 18/100;
        double totalPriceWithDiscount = totalPriceWithoutDisc - discount;

        System.out.printf("The final price is: %f lv.%n", totalPriceWithDiscount);
        System.out.printf("The discount is: %f lv.", discount);



    }
}
