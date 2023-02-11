package Songs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<Songs> songsList = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            String input = scanner.nextLine();
            String[] inputArr = input.split("_");
            String typeList = inputArr[0];
            String name = inputArr[1];
            String time = inputArr[2];
            Songs currentSong = new Songs(typeList, name, time);
            songsList.add(currentSong);

        }
        String lastCommand = scanner.nextLine();
        if (lastCommand.equals("all")) {
            for (Songs item : songsList) {
                System.out.println(item.getName());
            }
        } else {
            for (Songs item : songsList) {
                if (lastCommand.equals(item.getTypeList())) {
                    System.out.println(item.getName());
                }
            }
        }
    }
}
