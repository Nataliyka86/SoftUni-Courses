package FirstStepInCoding.Lab;

import java.util.Scanner;

public class USDtoBGN {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double usd = Double.parseDouble(scanner.nextLine());
        double bgn = usd * 1.75;




       System.out.println("With this amount of "+ usd + " USD, you can buy " + bgn + " BGN");






    }
}

