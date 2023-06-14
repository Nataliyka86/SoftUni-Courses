package BorderControl_05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        List<Robot> robotList = new ArrayList<>();
        List<Citizen> citizenList = new ArrayList<>();

        while (!input.equals("End")){
        String[] inputArr = input.split(" ");
        if (inputArr.length == 2){
            String model = inputArr[0];
            String idRobot = inputArr[1];
            Robot robot = new Robot(model,idRobot);
            robotList.add(robot);
        } else if (inputArr.length == 3){
            String name = inputArr[0];
            int age = Integer.parseInt(inputArr[1]);
            String idCitizen = inputArr[2];
            Citizen citizen = new Citizen(name, age, idCitizen);
            citizenList.add(citizen);
        }


            input = scanner.nextLine();
        }
        String number = scanner.nextLine();

        robotList.stream().filter(robot -> robot.getId().endsWith(number)).forEach(robot -> System.out.println(robot.getId()));
        citizenList.stream().filter(citizen -> citizen.getId().endsWith(number)).forEach(citizen -> System.out.println(citizen.getId()));




    }
}
