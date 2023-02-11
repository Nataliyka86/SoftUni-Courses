package ListyIterator;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        ListyIterator<String> listyIterator = new ListyIterator<String>();

        while (!input.equals("END")){
            String[] parameters = input.split("\\s+");
            switch (parameters[0]){
                case "Create":
                    if (parameters.length > 1){
                        listyIterator = new ListyIterator<>(Arrays.copyOfRange(parameters, 1, parameters.length));
                    }
                break;
                case "Move":
                    System.out.println(listyIterator.move());
                    break;
                case "HasNext":
                    System.out.println(listyIterator.hasNext());
                    break;
                case "Print":
                    try {
                    listyIterator.print();

                    } catch (IllegalStateException ex){
                        System.out.println(ex.getMessage());
                    }
                    break;
                case "PrintAll":
                    listyIterator.forEach( e -> System.out.print(e + " "));
                    System.out.println();
                    break;
            }

            input = scanner.nextLine();
        }

    }
}
