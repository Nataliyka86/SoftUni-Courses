package Exams.First;

import javax.sound.midi.MidiFileFormat;
import java.util.Scanner;

public class AluminumJoinery_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//1.	Брой дограми – цяло число в интервала [0..1000];
//2.	Вид на дограмите – текст "90X130" или "100X150" или "130X180" или "200X300";
//3.	Начин на получаване – текст
//•	С доставка - "With delivery"
//•	Без доставка - "Without delivery"

        int count = Integer.parseInt(scanner.nextLine());
        String kind = scanner.nextLine();
        String delivery = scanner.nextLine();
        double price = 0;

        switch (kind) {
            case "90X130":
                if (count <= 30) {
                    price = count * 110;
                } else if (count <= 60) {
                    price = count * (110 - 110 * 5.00 / 100);
                } else {
                    price = count * (110 - 110 * 8.00 / 100);
                }
                break;
            case "100X150":
                if (count <= 40) {
                    price = count * 140;
                } else if (count <= 80) {
                    price = count * (140 - 140 * 6.00 / 100);
                } else {
                    price = count * (140 - 140 * 10.00 / 100);
                }
                break;
            case "130X180":
                if (count <= 20) {
                    price = count * 190;
                } else if (count <= 50) {
                    price = count * (190 - 190 * 7.00 / 100);
                } else {
                    price = count * (190 - 190 * 12.00 / 100);
                }
                break;
            case "200X300":
                if (count <= 25) {
                    price = count * 250;
                } else if (count <= 50) {
                    price = count * (250 - 250 * 9.00 / 100);
                } else {
                    price = count * (250 - 250 * 14.00 / 100);
                }
                break;
        }
        if (delivery.equals("With delivery")) {
            price += 60;
        }
        if (count > 99) {
            price = price - (price * 0.04);
        }
        if (count < 10) {
            System.out.println("Invalid order");
        } else {
            System.out.printf("%.2f BGN", price);
        }
    }
}
