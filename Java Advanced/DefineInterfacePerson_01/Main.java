package DefineInterfacePerson_01;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Citizen> citizens = new ArrayList<>();
        List<Rebel> rebels = new ArrayList<>();

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String[] splittedInformation = scanner.nextLine().split(" ");
            if (splittedInformation.length == 4){
                citizens.add(new Citizen(splittedInformation[0], Integer.parseInt(splittedInformation[1]), splittedInformation[2], splittedInformation[3]));
                continue;
            }
            rebels.add(new Rebel(splittedInformation[0], Integer.parseInt(splittedInformation[1]), splittedInformation[2]));
        }

        String commmand = scanner.nextLine();
        while (!commmand.equals("End")){
            String name = commmand;
                citizens.stream().filter(citizen -> citizen.getName().equals(name)).findFirst().ifPresent(Citizen::buyFood);
                rebels.stream().filter(rebel -> rebel.getName().equals(name)).findFirst().ifPresent(Rebel::buyFood);

            commmand = scanner.nextLine();
        }
        System.out.println(citizens.stream().map(citizen -> citizen.getFood()).reduce(0, Integer::sum) + rebels.stream().map(rebel -> rebel.getFood()).reduce(0, Integer::sum));
        scanner.close();

        }
    }
