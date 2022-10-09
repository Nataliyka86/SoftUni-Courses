package FirstStepInCoding.Lab;

import java.util.Scanner;

public class ConcatenateData_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //име, фамилия, възраст и град

        String name = scanner.nextLine();
        String lastname = scanner.nextLine();
        int ages = Integer.parseInt(scanner.nextLine());
        String town = scanner.nextLine();
//"You are <firstName> <lastName>, a <age>-years old person from <town>."
        System.out.printf("You are %s %s, a %d-years old person from %s.", name, lastname, ages, town);



    }
}
