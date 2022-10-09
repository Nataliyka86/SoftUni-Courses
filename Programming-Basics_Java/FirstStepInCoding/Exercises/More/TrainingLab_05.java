package FirstStepsInCoding.Exercises.More;

import java.util.Scanner;

public class TrainingLab_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double h = Double.parseDouble(scanner.nextLine());
        double w = Double.parseDouble(scanner.nextLine());

        double countWorkplaceWidth = (w * 100 - 100) / 70;
        int countWorkPlaceWidthInt = (int)countWorkplaceWidth;
        double countWorkplaceHigh = h * 100/ 120;
        int countWorkPlaceHighInt = (int)countWorkplaceHigh;
        int countWorkplace = countWorkPlaceHighInt * countWorkPlaceWidthInt - 3;


        System.out.println(countWorkplace);


        }


    }

