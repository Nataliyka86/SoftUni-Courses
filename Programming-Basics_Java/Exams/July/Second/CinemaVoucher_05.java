package Exams.July.Second;

import java.util.Scanner;

public class CinemaVoucher_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int voucher = Integer.parseInt(scanner.nextLine());
        String text = scanner.nextLine();
        int ticketFilm = 0;
        int others = 0;
        int price = 0;


        while (!text.equals("End")) {
            if (text.length() > 8) {
                price = text.charAt(0) + text.charAt(1);
                if (price <= voucher) {
                    voucher -= price;
                    ticketFilm++;
                } else {
                    break;
                }
            } else {
                price = text.charAt(0);
                if (price <= voucher) {
                    voucher -= price;
                    others++;
                } else {
                    break;
                }
            }
            text = scanner.nextLine();
        }
        System.out.printf("%d%n", ticketFilm);
        System.out.printf("%d%n", others);
    }
}
