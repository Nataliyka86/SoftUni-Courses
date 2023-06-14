package RawData_04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<Car> carList = new ArrayList<>();
        Engine engine;
        Cargo cargo;
        Tire tire1;
        Tire tire2;
        Tire tire3;
        Tire tire4;
        Car car;
        for (int i = 1; i <= n; i++) {
            String[] input = scanner.nextLine().split("\\s+");
            String model = input[0];
            int engineSpeed = Integer.parseInt(input[1]);
            int enginePower = Integer.parseInt(input[2]);
            int cargoWeight = Integer.parseInt(input[3]);
            String cargoType = input[4];
            double tirePressure1 = Double.parseDouble(input[5]);
            int tireAge1 = Integer.parseInt(input[6]);
            double tirePressure2 = Double.parseDouble(input[7]);
            int tireAge2 = Integer.parseInt(input[8]);
            double tirePressure3 = Double.parseDouble(input[9]);
            int tireAge3 = Integer.parseInt(input[10]);
            double tirePressure4 = Double.parseDouble(input[11]);
            int tireAge4 = Integer.parseInt(input[12]);
            engine = new Engine(engineSpeed, enginePower);
            cargo = new Cargo(cargoWeight, cargoType);
            tire1 = new Tire(tireAge1, tirePressure1);
            tire2 = new Tire(tireAge2, tirePressure2);
            tire3 = new Tire(tireAge3, tirePressure3);
            tire4 = new Tire(tireAge4, tirePressure4);
            List<Tire> tireList = new ArrayList<>();
            tireList.add(tire1);
            tireList.add(tire2);
            tireList.add(tire3);
            tireList.add(tire4);
            car = new Car(model, engine, cargo, tireList);
            carList.add(car);
        }
        String command = scanner.nextLine();
        if (command.equals("fragile")) {
            List<String> fragileList = carList.stream()
                    .filter(car1 -> car1.getCargo().getCargoType().equals("fragile"))
                    .filter(car1 -> car1.getTireList().stream().anyMatch(tire -> tire.getTirePressure() < 1))
                    .map(car1 -> car1.getModel())
                    .collect(Collectors.toList());
            fragileList.forEach(e -> System.out.println(e));

        } else {
            List<String> flamableList = carList.stream()
                    .filter(car1 -> car1.getCargo().getCargoType().equals("flamable"))
                    .filter(car1 -> car1.getEngine().getEnginePower() > 250)
                    .map(car1 -> car1.getModel())
                    .collect(Collectors.toList());
            flamableList.forEach(e -> System.out.println(e));
        }

    }
}
