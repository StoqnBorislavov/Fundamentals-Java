package AssociativeArrays.Exercise;

import javax.xml.crypto.dom.DOMCryptoContext;
import java.util.*;
import java.util.stream.Collectors;

public class StudentAcademy_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        Map<String, List<Double>> studentsGrades = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String name = sc.nextLine();
            double grade = Double.parseDouble(sc.nextLine());

            if (!studentsGrades.containsKey(name)) {
                studentsGrades.put(name, new ArrayList<>());
            }
            studentsGrades.get(name).add(grade);

        }
        Map<String, Double> averageMapGrade = new LinkedHashMap<>();
        for (Map.Entry<String, List<Double>> entry : studentsGrades.entrySet()) {
            double averageGrade = entry.getValue().stream().mapToDouble(e -> e).average().getAsDouble();
            averageMapGrade.put(entry.getKey(), averageGrade);

        }
        averageMapGrade.entrySet().stream()
                .sorted((e1, e2) -> Double.compare(e2.getValue(), e1.getValue()))
                .forEach(e -> {
                    if (e.getValue() >= 4.5) {
                        System.out.printf("%s -> %.2f%n", e.getKey(), e.getValue());
                    }
                });
    }
}
