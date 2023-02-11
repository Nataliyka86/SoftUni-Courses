package Regex.Exercises;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Race_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String namesParticipants = scanner.nextLine();
        List<String> namesList = Arrays.stream(namesParticipants.split(", ")).collect(Collectors.toList());
        Map<String, Integer> racerMap = new LinkedHashMap<>();
        namesList.forEach(name -> racerMap.put(name, 0));

        String regexLetters = "[A-Za-z]+";
        Pattern patternLetters = Pattern.compile(regexLetters);

        String regexDigits = "[0-9]";
        Pattern patternDigits = Pattern.compile(regexDigits);

        String input = scanner.nextLine();

        while (!input.equals("end of race")) {
            StringBuilder nameBd = new StringBuilder();
            Matcher matcherLetters = patternLetters.matcher(input);
            while (matcherLetters.find()) {
                nameBd.append(matcherLetters.group());
            }
            int distance = 0;
            Matcher matcherDigits = patternDigits.matcher(input);
            while (matcherDigits.find()) {
                distance += Integer.parseInt(matcherDigits.group());
            }
            if (namesList.contains(nameBd.toString())) {
                int currentDistance = racerMap.get(nameBd.toString());
                racerMap.put(nameBd.toString(), currentDistance + distance);
            }
            input = scanner.nextLine();
        }
        List<String> top3Names = racerMap.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).limit(3).map(entry -> entry.getKey()).collect(Collectors.toList());
        System.out.println("1st place: " + top3Names.get(0));
        System.out.println("2nd place: " + top3Names.get(1));
        System.out.println("3rd place: " + top3Names.get(2));
//        int counter = 1;
//        for (Map.Entry<String, Integer> pair : racerMap.entrySet()) {
//            if (counter == 1) {
//                System.out.println("1st place: " + pair.getKey());
//                counter++;
//            } else if (counter == 2) {
//                System.out.println("2nd place: " + pair.getKey());
//                counter++;
//            } else if (counter == 3) {
//                System.out.println("3rd place: " + pair.getKey());
//                break;
//            }
        //      }

    }
}
