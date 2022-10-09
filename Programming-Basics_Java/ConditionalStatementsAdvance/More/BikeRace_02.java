package ConditionalStatementsAdvance.More;

import java.util.Scanner;

public class BikeRace_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //•	Третият ред – вид трасе – "trail", "cross-country", "downhill" или "road"
        int juniorCount = Integer.parseInt(scanner.nextLine());
        int seniorCount = Integer.parseInt(scanner.nextLine());
        String trace = scanner.nextLine();
        double tax = 0.00;

        switch (trace){
            case "trail":
                tax = juniorCount * 5.50 + seniorCount * 7.00;
                break;
            case "cross-country":
                tax = juniorCount * 8.00 + seniorCount * 9.50;
                if (juniorCount + seniorCount >=50){
                    tax = tax - (tax * 0.25);
                }
                break;
            case "downhill":
                tax = juniorCount * 12.25 + seniorCount * 13.75;
                break;
            case "road":
                tax = juniorCount * 20 + seniorCount * 21.50;
                break;
        }
        tax = tax - (tax * 0.05);
        System.out.printf("%.2f",tax);
    }
}
