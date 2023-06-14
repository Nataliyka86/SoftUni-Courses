package OOP.Abstractions.TrafficLights_044;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputArr = scanner.nextLine().split("\\s+");
        int n = Integer.parseInt(scanner.nextLine());
        Signal[] signals = new Signal[inputArr.length];

        for (int i = 0; i < inputArr.length; i++) {
            String s = inputArr[i];
            Signal.Light signalLight = Signal.Light.valueOf(s);
            signals[i] = new Signal(signalLight);

        }

        for (int i = 1; i <= n; i++) {
            for (Signal signal : signals) {
                signal.showNextLight();
            }
            printTrafficLights(signals);
        }
    }

    private static void printTrafficLights(Signal[] signals) {
        for (Signal signal : signals) {
            System.out.print(signal.getLight() + " ");
        }
        System.out.println();
    }
}
