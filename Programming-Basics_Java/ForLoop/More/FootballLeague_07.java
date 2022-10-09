package ForLoop.More;

import java.util.Scanner;

public class FootballLeague_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int capacity = Integer.parseInt(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());
        double fensA = 0;
        double fensB = 0;
        double fensV = 0;
        double fensG = 0;

        for (int i = 1; i <= n; i++) {
            String sector = scanner.nextLine();
            switch (sector) {
                case "A":
                    fensA += 1;
                    break;
                case "B":
                    fensB += 1;
                    break;
                case "V":
                    fensV += 1;
                    break;
                case "G":
                    fensG += 1;
                    break;
            }
        }
        System.out.printf("%.2f%%%n", fensA / n * 100);
        System.out.printf("%.2f%%%n", fensB / n * 100);
        System.out.printf("%.2f%%%n", fensV / n * 100);
        System.out.printf("%.2f%%%n", fensG / n * 100);
        System.out.printf("%.2f%%%n", n * 1.00/ capacity * 100);
    }
}
