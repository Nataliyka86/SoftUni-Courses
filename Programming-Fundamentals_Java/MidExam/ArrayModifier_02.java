package MidExam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ArrayModifier_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> inputList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        String command = scanner.nextLine();
        while (!command.equals("end")) {
            String[] commandArr = command.split(" ");
            switch (commandArr[0]) {
                case "swap":
                    int firstNum = inputList.get(Integer.parseInt(commandArr[1]));
                    int secondNum = inputList.get(Integer.parseInt(commandArr[2]));
                    inputList.set(Integer.parseInt(commandArr[1]), secondNum);
                    inputList.set(Integer.parseInt(commandArr[2]), firstNum);
                    break;
                case "multiply":
                    int firstElement = inputList.get(Integer.parseInt(commandArr[1]));
                    int secondElement = inputList.get(Integer.parseInt(commandArr[2]));
                    int newFirstElement = firstElement * secondElement;
                    inputList.set(Integer.parseInt(commandArr[1]), newFirstElement);
                    break;
                case "decrease":
                    for (int i = 0; i < inputList.size(); i++) {
                        int newElement = inputList.get(i) - 1;
                        inputList.set(i, newElement);
                    }
                    break;
            }
            command = scanner.nextLine();
        }
        for (int i = 0; i < inputList.size() - 1; i++) {

            System.out.print(inputList.get(i) + ", ");
        }
        System.out.print(inputList.get(inputList.size() - 1));
    }
}
