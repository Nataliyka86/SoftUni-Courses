package Exam;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class MessagesManager_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int capacity = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();
        LinkedHashMap<String, Integer> sentMap = new LinkedHashMap<>();
        LinkedHashMap<String, Integer> receiveMap = new LinkedHashMap<>();

        while (!command.equals("Statistics")) {
            String[] commandArr = command.split("=");
            switch (commandArr[0]) {
                case "Add":
                    String username = commandArr[1];
                    int sent = Integer.parseInt(commandArr[2]);
                    int received = Integer.parseInt(commandArr[3]);
                    sentMap.putIfAbsent(username, sent);
                    receiveMap.putIfAbsent(username, received);
                    break;
                case "Message":
                    String sender = commandArr[1];
                    String receiver = commandArr[2];
                    if (sentMap.containsKey(sender) && sentMap.containsKey(receiver)) {
                        sentMap.put(sender, sentMap.get(sender) + 1);
                        receiveMap.put(receiver, receiveMap.get(receiver) + 1);
                    }
                    int currentSent = sentMap.get(sender) + receiveMap.get(sender);
                    if (currentSent >= capacity) {
                        sentMap.remove(sender);
                        receiveMap.remove(sender);
                        System.out.printf("%s reached the capacity!%n", sender);

                        int currentReceive = sentMap.get(receiver) + receiveMap.get(receiver);
                        if (currentReceive >= capacity) {
                            sentMap.remove(receiver);
                            receiveMap.remove(receiver);
                            System.out.printf("%s reached the capacity!%n", receiver);
                        }
                    }
                    break;
                case "Empty":
                    String username2 = commandArr[1];
                    if (username2.equals("All")) {
                        sentMap.clear();
                        receiveMap.clear();
                    } else if (sentMap.containsKey(username2)) {
                        sentMap.remove(username2);
                        receiveMap.remove(username2);
                    }
                    break;
            }
            command = scanner.nextLine();
        }
        int count = sentMap.size();
        System.out.printf("Users count: %d%n", count);
        if (count > 0) {
            for (Map.Entry<String, Integer> entry : sentMap.entrySet()) {
                int numberOfMessages = entry.getValue() + receiveMap.get(entry.getKey());
                System.out.printf("%s - %d%n", entry.getKey(), numberOfMessages);
            }
        }
    }
}
