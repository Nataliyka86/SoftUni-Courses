package FirstStepInCoding.Lab;

import java.util.Scanner;

public class BGNtoUSD

{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double BGN = Double.parseDouble(scanner.nextLine());
        double USD = BGN / 1.75;


        System.out.println("With this amount of "+ BGN + " BGN, you can buy " + USD + " USD");




    }
}
