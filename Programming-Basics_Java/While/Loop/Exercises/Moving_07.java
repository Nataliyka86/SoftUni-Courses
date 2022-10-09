package While.Loop.Exercises;

import java.util.Scanner;

public class Moving_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int height = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());
        int volume = height * width * length;

        while (volume > 0) {
            String input = scanner.nextLine();
            if (input.equals("Done")) {
                break;
            }
            int cubes = Integer.parseInt(input);
            volume -= cubes;
        }
        if (volume < 0) {
            System.out.printf("No more free space! You need %d Cubic meters more.", Math.abs(volume));
        } else {
            System.out.printf("%d Cubic meters left.", volume);
        }
    }
}
