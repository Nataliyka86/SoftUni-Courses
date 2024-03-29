package ClassesObjects.Lab;

import java.math.BigInteger;
import java.util.Scanner;

public class BigFactorial_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        BigInteger resultBig = new BigInteger(String.valueOf(1));
        for (int i = 1; i <= n; i++) {
            resultBig = resultBig.multiply(BigInteger.valueOf(i));
        }
        System.out.println(resultBig);
    }
}
