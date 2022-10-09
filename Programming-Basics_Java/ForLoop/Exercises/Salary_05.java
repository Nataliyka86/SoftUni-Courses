package ForLoop.Exercises;

import java.util.Scanner;

public class Salary_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //•	Брой отворени табове в браузъра n - цяло число в интервала [1...10]
        //•	Заплата - число в интервала [500...1500]

        int n = Integer.parseInt(scanner.nextLine());
        double salary = Double.parseDouble(scanner.nextLine());
        double penalty = 0.00;

        for (int i = 1; i <= n; i++) {
            String website = scanner.nextLine();
            switch (website) {
                case "Facebook":
                    penalty += 150;
                    break;
                case "Instagram":
                    penalty += 100;
                    break;
                case "Reddit":
                    penalty += 50;
                    break;
                default:
                    penalty += 0;
                    break;

            }
            if (salary <= penalty) {
                System.out.println("You have lost your salary.");
                break;
            }
        }
        if (salary > penalty) {
            System.out.printf("%.0f", salary - penalty);
        }
    }


}

