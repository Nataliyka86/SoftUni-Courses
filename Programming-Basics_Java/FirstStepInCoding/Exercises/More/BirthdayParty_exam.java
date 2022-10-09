package FirstStepsInCoding.Exercises.More;

import java.util.Scanner;

public class BirthdayParty_exam {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //•	Торта  – цената ѝ е 20% от наема на залата
        //•	Напитки – цената им е 45% по-малко от тази на тортата
        //•	Аниматор – цената му е 1/3 от цената за наема на залата
        double rent = Double.parseDouble(scanner.nextLine());

        double cake = rent * 20/100;
        double drinks = cake - (cake * 45/100);
        double animator = rent / 3;

        double totalCost = rent + cake + drinks + animator;

        System.out.println(totalCost);

        }

    }

