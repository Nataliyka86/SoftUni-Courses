package FirstStepsInCoding.Exercises.More;

import java.util.Scanner;

public class HousePainting_07 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

         double x = Double.parseDouble(scanner.nextLine());
         double y = Double.parseDouble(scanner.nextLine());
         double h = Double.parseDouble(scanner.nextLine());


         double areaFrontBackWall = 2 * x * x - 1.20 * 2;
         double areaLeftRightWalls = 2 *(x * y) - 2 * ( 1.50 * 1.50);
         double areaGreenPaint = areaFrontBackWall + areaLeftRightWalls;
         double areaGreenCost = areaGreenPaint / 3.40;

         double areaRoof = 2 * (x * y) + 2 * (x/2 * h);
         double areaRedCost = areaRoof / 4.30;

         System.out.printf("%.2f %n", areaGreenCost);
         System.out.printf("%.2f", areaRedCost);

         }


         }



