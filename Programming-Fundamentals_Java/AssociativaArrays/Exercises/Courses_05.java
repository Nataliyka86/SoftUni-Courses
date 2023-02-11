package AssociativaArrays.Exercises;

import java.util.*;

public class Courses_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        LinkedHashMap<String, List<String>> studentMap = new LinkedHashMap<>();

        while (!input.equals("end")) {
            String course = input.split(" : ")[0];
            String student = input.split(" : ")[1];
            if (!studentMap.containsKey(course)) {
                studentMap.put(course, new ArrayList<>());
            }
            studentMap.get(course).add(student);
            input = scanner.nextLine();
        }
        for (Map.Entry<String, List<String>> entry : studentMap.entrySet()) {
            System.out.printf("%s: %d%n", entry.getKey(), entry.getValue().size());
//           entry.getValue().forEach(user -> System.out.println("-- " + user));
            for (String user : entry.getValue()) {
                System.out.println("-- " + user);
            }
        }

    }
}
