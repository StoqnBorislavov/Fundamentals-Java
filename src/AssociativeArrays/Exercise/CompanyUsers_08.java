package AssociativeArrays.Exercise;

import org.w3c.dom.ls.LSOutput;

import java.util.*;

public class CompanyUsers_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        Map<String, List<String>> companies = new HashMap<>();
        while (!input.equals("End")) {
            String company = input.split("->")[0];
            String employeeId = input.split(" -> ")[1];
            if (!companies.containsKey(company)) {
                companies.put(company, new ArrayList<>());
            }
            if (!companies.get(company).contains(employeeId)) {
                companies.get(company).add(employeeId);
            }
            input = sc.nextLine();
        }
        companies.entrySet().stream().sorted(Map.Entry.comparingByKey())
                .forEach(e -> {
                    System.out.println(e.getKey());
                    e.getValue().stream().forEach(value -> System.out.println("-- " + value));
                });

    }
}
