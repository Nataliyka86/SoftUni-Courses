package While.Loop.More;

import java.util.Scanner;

public class StreamOfLetters_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int countN = 0;
        int countO = 0;
        int countC = 0;
        int i = 0;
        String command = "";

        while (!input.equals("End")) {
            switch (input) {
                case "n":
                    countN++;
                    if (countN == 1) {
                        System.out.print(input.charAt(i));
                    } else  if (countN == 2){
                        System.out.print(command.charAt(i));
                    }
                    break;
                case "o":
                    countO++;
                    if (countO == 1) {
                        continue;
                    } else {
                        System.out.print(input.charAt(i));
                    }
                    break;
                case "c":
                    countC++;
                    if (countC == 1) {
                        continue;
                    } else {
                        System.out.print(input.charAt(i));
                    }
                    break;
                default:
                    System.out.print(input.charAt(i));
                    break;
            }
            input = scanner.nextLine();
            i++;
        }

    }
}
