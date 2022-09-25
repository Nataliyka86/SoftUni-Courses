package BasicSyntaxConditionalStatementsandLoops.Exercises;

import javax.sound.midi.MidiFileFormat;
import java.util.Scanner;

public class PadawanEquipment_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//•	The amount of money George Lucas has – the floating-point number in the range [0.00…1,000.00].
//•	The count of students – integer in the range [0…100].
//•	The price of lightsabers for a single saber – the floating-point number in the range [0.00…100.00].
//•	The price of robes for a single robe – the floating-point number in the range [0.00…100.00].
//•	The price of belts for a single belt – the floating-point number in the range [0.00…100.00].

        double money = Double.parseDouble(scanner.nextLine());
        int students = Integer.parseInt(scanner.nextLine());
        double priceLightsabers = Double.parseDouble(scanner.nextLine());
        double priceRobes = Double.parseDouble(scanner.nextLine());
        double priceBelts = Double.parseDouble(scanner.nextLine());

        double totalLightsabers = priceLightsabers * Math.ceil(students * 0.10 + students);
        double totalRobes = priceRobes * students;
        double totalBelts = (students - students / 6) * priceBelts;

        double total = totalBelts + totalRobes + totalLightsabers;
        if (total <= money) {
            System.out.printf("The money is enough - it would cost %.2flv.", total);
        } else {
            System.out.printf("George Lucas will need %.2flv more.", total - money);
        }
    }
}
