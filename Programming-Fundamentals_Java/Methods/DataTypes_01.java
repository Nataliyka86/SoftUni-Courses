package Methods.More;

import javax.xml.stream.StreamFilter;
import java.text.DecimalFormat;
import java.util.Scanner;

public class DataTypes_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String type = scanner.nextLine();

        switch (type) {
            case "int":
                int inputInt = Integer.parseInt(scanner.nextLine());
                System.out.println(dataType(inputInt));
                break;
            case "real":
                double inputDouble = Double.parseDouble(scanner.nextLine());
                System.out.printf("%.2f", dataType(inputDouble));
                break;
            case "string":
                String inputString = scanner.nextLine();
                System.out.println(dataType(inputString));
                break;
        }
    }

    public static int dataType(int n) {
        int result = n * 2;
        return result;
    }

    public static double dataType(double n) {
        double result = n * 1.5;
        return result;

    }

    public static String dataType(String text) {
        String result = "$" + text + "$";
        return result;
    }
}
