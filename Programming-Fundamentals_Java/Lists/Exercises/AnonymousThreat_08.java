package Lists.Exercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AnonymousThreat_08 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<String> inputList = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());

        String command = scanner.nextLine();
        while (!command.equals("3:1")) {
            String[] commandArr = command.split(" ");
            if (command.contains("merge")) {
                int startIndex = Integer.parseInt(commandArr[1]);
                int endIndex = Integer.parseInt(commandArr[2]);
                if (endIndex > inputList.size() - 1) {
                    endIndex = inputList.size() - 1;
                }
                if (startIndex < 0) {
                    startIndex = 0;
                }

                boolean isValidIndexes = startIndex <= inputList.size() - 1 && endIndex >= 0 && startIndex < endIndex;
                if (isValidIndexes) {
                    String resultMerge = "";
                    for (int i = startIndex; i <= endIndex; i++) {
                        resultMerge += inputList.get(i);

                    }
                    for (int i = startIndex; i <= endIndex; i++) {
                        inputList.remove(startIndex);
                    }
                    inputList.add(startIndex, resultMerge);
                }
            } else if (command.contains("divide")) {
                int index = Integer.parseInt(commandArr[1]);
                int parts = Integer.parseInt(commandArr[2]);
                String toDivide = inputList.get(index);
                inputList.remove(index);
                int partSize = toDivide.length() / parts;
                int beginIndexOfText = 0;
                for (int i = 1; i < parts; i++) {
                    inputList.add(index, toDivide.substring(beginIndexOfText, beginIndexOfText + partSize));
                    index++;
                    beginIndexOfText += partSize;
                }
                inputList.add(index, toDivide.substring(beginIndexOfText));
            }
            command = scanner.nextLine();
        }
        System.out.println(String.join(" ", inputList));
    }
}
