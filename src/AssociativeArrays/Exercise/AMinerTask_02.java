package AssociativeArrays.Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class AMinerTask_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        int lineCounter = 0;
        String resource = "";
        Map<String, Integer> recourseMap = new LinkedHashMap<>();
        while (!input.equals("stop")) {
            lineCounter++;
            if (lineCounter % 2 == 0) {
                int quantity = Integer.parseInt(input);
                int oldQuantity = recourseMap.get(resource);
                int newQuantity = oldQuantity + quantity;
                if (recourseMap.containsKey(resource)) {
                    recourseMap.put(resource, newQuantity);
                } else {
                    recourseMap.put(resource, quantity);
                }
                resource = "";
            } else {
                resource = input;
                if (!recourseMap.containsKey(resource)) {
                    recourseMap.put(resource, 0);
                }
            }

            input = sc.nextLine();
        }
        for (Map.Entry<String, Integer> entry : recourseMap.entrySet()) {
            System.out.printf("%s -> %d%n", entry.getKey(), entry.getValue());
        }
    }
}
