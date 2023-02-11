package Exam;

import java.util.Scanner;
import java.util.WeakHashMap;

public class PasswordReset_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String password = scanner.nextLine();
        String input = scanner.nextLine();


        while (!input.equals("Done")) {
            String[] commandArr = input.split("\\s+");
            switch (commandArr[0]) {
                case "TakeOdd":
                    String newPassword = "";
                    for (int i = 0; i < password.length(); i++) {
                        if (i % 2 != 0) {
                            char symbol = password.charAt(i);
                            newPassword += symbol;
                        }
                    }
                        password = newPassword;
                    System.out.println(password);
                    break;
                case "Cut":
                    int index = Integer.parseInt(commandArr[1]);
                    int length = Integer.parseInt(commandArr[2]);
                    String substring1 = password.substring(index, index + length);
                    password = password.replaceFirst(substring1, "");
                    System.out.println(password);
                    break;
                case "Substitute":
                    String substring = commandArr[1];
                    String substitute = commandArr[2];
                    if (password.contains(substring)) {
                        password = password.replaceAll(substring, substitute);
                        System.out.println(password);
                    } else {
                        System.out.println("Nothing to replace!");
                    }
                    break;
            }
            input = scanner.nextLine();
        }
        System.out.printf("Your password is: %s", password);
    }
}


