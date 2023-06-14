import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EnterNumbers_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startNumber = 1;
        int endNumber = 100;
        List<String> numberList = new ArrayList<>();

        while (numberList.size() < 10) {
            String input = scanner.nextLine();

            readNumber(input, startNumber, endNumber, numberList);
            if (!numberList.isEmpty()) {

                startNumber = Integer.parseInt(numberList.get(numberList.size() - 1));
            }
        }
        System.out.println(String.join(", ", numberList));

    }

    private static void readNumber(String input, int startNumber, int endNumber, List<String> numberList) {
        try {
            int currentNumber = Integer.parseInt(input);
            if (currentNumber > startNumber && currentNumber < endNumber) {
                numberList.add(input);
            } else {
                System.out.printf("Your number is not in range %d - 100!%n", startNumber);
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid Number!");
        }
    }
}
