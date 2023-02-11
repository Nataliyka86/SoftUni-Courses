package Advanced.Classes.SpeedRacing;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Map<String, Car> carsMap = new LinkedHashMap<>();
        Car car;
        for (int i = 1; i <= n; i++) {
            String[] input = scanner.nextLine().split("\\s+");
            String model = input[0];
            double fuelAmount = Double.parseDouble(input[1]);
            double consumption = Double.parseDouble(input[2]);
            car = new Car(model, fuelAmount, consumption);
            carsMap.put(model, car);
        }
        String command = scanner.nextLine();
        while (!command.equals("End")) {
            String carModel = command.split("\\s+")[1];
            int amountKm = Integer.parseInt(command.split("\\s+")[2]);
            Car carToDrive = carsMap.get(carModel);
            if (!carToDrive.drive(amountKm)) {
                System.out.println("Insufficient fuel for the drive");
            }
            command = scanner.nextLine();
        }

        for (Car cars : carsMap.values()) {
            System.out.println(cars.toString());
        }
    }
}
