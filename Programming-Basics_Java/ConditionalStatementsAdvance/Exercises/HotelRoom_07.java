package ConditionalStatementsAdvance.Exercises;

import java.util.Scanner;

public class HotelRoom_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String month = scanner.nextLine();
        int days = Integer.parseInt(scanner.nextLine());
        double costApartment = 0.00;
        double costStudio = 0.00;

        switch (month) {
            case "May":
            case "October":
                if (days<=7) {
                    costStudio = days * 50;
                    costApartment = days * 65;
                }
                 else if (days <= 14) {
                    costStudio = (days * 50) - (days * 50 * 0.05);
                    costApartment = days * 65;
                } else {
                    costStudio = (days * 50) - (days * 50 * 0.30);
                    costApartment = (days * 65) - (days * 65 * 0.10);
                }
                break;
            case "June":
            case "September":
                if (days <= 14) {
                    costStudio = days * 75.20;
                    costApartment = days * 68.70;
                } else {
                    costStudio = (days * 75.20) - (days * 75.20 * 0.20);
                    costApartment = (days * 68.70) - (days * 68.70 * 0.10);
                }
                break;
            case "July":
            case "August":
                costStudio = days * 76;
                if (days <= 14) {
                    costApartment = days * 77;
                } else {
                    costApartment = (days * 77) - (days * 77 * 0.10);
                }
                break;
        }
        System.out.printf("Apartment: %.2f lv.%n", costApartment);
        System.out.printf("Studio: %.2f lv.", costStudio);

    }
}
