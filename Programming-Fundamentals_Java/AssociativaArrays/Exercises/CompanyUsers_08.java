package AssociativaArrays.Exercises;

import java.util.*;

public class CompanyUsers_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        LinkedHashMap<String, List<String>> companyMap = new LinkedHashMap<>();

        while (!input.equals("End")) {
            String company = input.split(" -> ")[0];
            String employeeID = input.split(" -> ")[1];
            if (!companyMap.containsKey(company)) {
                companyMap.put(company, new ArrayList<>());
            }
            if (companyMap.get(company).contains(employeeID)) {
                input = scanner.nextLine();
                continue;
            } else {
                companyMap.get(company).add(employeeID);
            }

            input = scanner.nextLine();
        }
        for (Map.Entry<String, List<String>> entry : companyMap.entrySet()) {
            System.out.printf("%s%n", entry.getKey());
            for (String item : entry.getValue()) {
                System.out.println("-- " + item);
            }
        }

    }
}
