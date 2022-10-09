package FirstStepInCoding.Lab;

import java.util.Scanner;

public class ProjectsCreation_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1.	Името на архитекта - текст
        //2.	Брой на проектите, които трябва да изготви - цяло число в интервала [0 … 100]

        String nameArch = scanner.nextLine();
        int countProject = Integer.parseInt(scanner.nextLine());

        int totalTime = countProject * 3;

        System.out.printf("The architect %s will need %d hours to complete %d project/s.", nameArch, totalTime, countProject);




    }
}
