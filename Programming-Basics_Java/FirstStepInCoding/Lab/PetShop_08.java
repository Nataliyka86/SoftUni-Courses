package FirstStepInCoding.Lab;

import java.util.Scanner;

public class PetShop_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dogsPack = Integer.parseInt(scanner.nextLine());
        int catsPack = Integer.parseInt(scanner.nextLine());

        double dogsTotalPrice = dogsPack * 2.50;
        double catsTotalPrice = catsPack * 4;


        double TotalPrice = dogsTotalPrice + catsTotalPrice;
        System.out.printf(" %f lv.", TotalPrice);



    }

}
