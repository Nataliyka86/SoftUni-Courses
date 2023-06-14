package telephony;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] numbers = scanner.nextLine().split(" ");
        String[] urls = scanner.nextLine().split(" ");

        List<String> numbersList = new ArrayList<>();
        List<String> urlsList = new ArrayList<>();
        for (String number : numbers){
            for (Character symbol: number.toCharArray()){
                if (!Character.isDigit(symbol)){
                    System.out.println("Invalid number!");

                }
            }
            numbersList.add(number);
        }
        for (String url : urls){
            urlsList.add(url);
        }
        Smartphone smartphone = new Smartphone(numbersList, urlsList);
        System.out.println(smartphone);
    }
}
