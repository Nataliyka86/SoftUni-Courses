package SetsAndMaps.Exercises;

import java.util.*;

public class UserLogs_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Map<String, LinkedHashMap<String, Integer>> dataMap = new TreeMap<>();

        while (!input.equals("end")) {
            String ip = input.split("\\s+")[0].split("=")[1];
            String username = input.split("\\s+")[2].split("=")[1];

            if (!dataMap.containsKey(username)) {
                dataMap.put(username, new LinkedHashMap<>());
            }
            Map<String, Integer> currentIps = dataMap.get(username);
            if (!currentIps.containsKey(ip)) {
                currentIps.put(ip, 1);
            } else {
                currentIps.put(ip, currentIps.get(ip) + 1);
            }

            input = scanner.nextLine();
        }
        for (String username : dataMap.keySet()) {
            System.out.println(username + ": ");
            Map<String, Integer> currentIps = dataMap.get(username);
            int countIps = currentIps.size();
            for (String ip : currentIps.keySet()) {
                if (countIps == 1) {
                    System.out.println(ip + " => " + currentIps.get(ip) + ".");
                } else {
                    System.out.print(ip + " => " + currentIps.get(ip) + ", ");
                }
                countIps--;
            }
        }
    }
}
