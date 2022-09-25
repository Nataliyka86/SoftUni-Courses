package BasicSyntaxConditionalStatementsandLoops.Lab;

import javax.imageio.plugins.tiff.TIFFDirectory;
import javax.sound.midi.MidiFileFormat;
import java.math.BigDecimal;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int power = Integer.parseInt(scanner.nextLine());
        int distance = Integer.parseInt(scanner.nextLine());
        int factor = Integer.parseInt(scanner.nextLine());
        int count = 0;
        int starPower = power;
        while (power >= distance) {
            count++;
            power -= distance;
            if (power == starPower / 2) {
                if (factor != 0) {
                    power = power / factor;
                }
            }
        }
        System.out.println(power);
        System.out.println(count);

    }
}

