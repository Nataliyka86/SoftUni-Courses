package Methods.More;

import java.util.Scanner;

public class MultiplicationSign_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());
        int n3 = Integer.parseInt(scanner.nextLine());
        if (printPositive(n1, n2, n3)) {
            System.out.println("positive");
        } else if (printZero(n1, n2, n3)) {
            System.out.println("zero");
        } else {
            System.out.println("negative");
        }

    }

    public static boolean printPositive(int n1, int n2, int n3) {
        return ((n1 > 0 && n2 > 0 && n3 > 0) || (n1 < 0 && n2 < 0 && n3 > 0) || (n1 > 0 && n2 < 0 && n3 < 0) || (n1 < 0 && n2 > 0 && n3 < 0));
    }

    public static boolean printZero(int n1, int n2, int n3) {
        return (n1 == 0 || n2 == 0 || n3 == 0);
    }
}
