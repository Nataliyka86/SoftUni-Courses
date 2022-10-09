package FirstStepsInCoding.Exercises.More;

import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double degrees = Double.parseDouble(scanner.nextLine());

//26.00 - 35.00	Hot
//20.1 - 25.9	Warm
//15.00 - 20.00	Mild
//12.00 - 14.9	Cool
//5.00 - 11.9	Cold


        if (degrees >= 26.00){
            if (degrees <= 35.00) {
                System.out.println("Hot"); }
            }
            else if (degrees >= 20.10){
                if (degrees <= 25.90) {
                    System.out.println("Warm"); }
                }
    }
}