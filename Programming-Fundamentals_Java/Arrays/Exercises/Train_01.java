package Arrays.Exercises;

import java.util.Scanner;

public class Train_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String[] newArr = new String[n];
        int sum = 0;

        for (int i = 0; i < n; i++) {
            String people = scanner.nextLine();
            newArr[i] = people;
            sum += Integer.parseInt(people);

        }
        System.out.println(String.join(" ", newArr));
        System.out.println(sum);

    }
}
