package SpeedRacing_03;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countCars = Integer.parseInt(scanner.nextLine());

        Map<String, Car> carsMap = new LinkedHashMap<>();

        for (int i = 1; i <= countCars; i++) {
            String data = scanner.nextLine();
            String model = data.split("\\s+")[0];
            double fuelAmount = Double.parseDouble(data.split("\\s+")[1]);
            double consumptionFuelPerKm = Double.parseDouble(data.split("\\s+")[2]);

            Car car = new Car(model, fuelAmount, consumptionFuelPerKm);
            carsMap.put(model, car);
        }

        String command = scanner.nextLine();
        while (!command.equals("End")) {
            String carModelToDrive = command.split("\\s+")[1];
            int kmToDrive = Integer.parseInt(command.split("\\s+")[2]);
            Car carToDrive = carsMap.get(carModelToDrive);

            //drive -> false -> горивото не ни стига
            //drive -> труе -> горивото стига и изминаваме разстоянието
            if (!carToDrive.drive(kmToDrive)) {
                System.out.println("Insufficient fuel for the drive");
            }
            command = scanner.nextLine();
        }
        for (Car car : carsMap.values()) {
            System.out.println(car.toString());
        }

    }
}
