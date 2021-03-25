package PastFinalExams;

import java.util.*;

public class PlantDiscovery_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        Map<String, Integer> rarityMap = new HashMap<>();
        Map<String, List<Integer>> ratingMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String[] input = sc.nextLine().split("<\\->");
            String plantName = input[0];
            int rarity = Integer.parseInt(input[1]);
            rarityMap.put(plantName, rarity);
            ratingMap.put(plantName, new ArrayList<>());
        }
        String command = sc.nextLine();

        while (!command.equals("Exhibition")) {
            String[] commandList = command.split("\\: ");
            String commandName = commandList[0];
            String[] text = commandList[1].split(" \\- ");
            String plantName = text[0];
            switch (commandName) {
                case "Rate":
                    int rating = Integer.parseInt(text[1]);
                    if (ratingMap.containsKey(plantName)) {
                        ratingMap.get(plantName).add(rating);
                    } else {
                        System.out.println("error");
                    }
                    break;
                case "Update":
                    int rarity = Integer.parseInt(text[1]);
                    if (rarityMap.containsKey(plantName)) {
                        rarityMap.put(plantName, rarity);
                    } else {
                        System.out.println("error");
                    }
                    break;
                case "Reset":
                    if (ratingMap.containsKey(plantName)) {
                        ratingMap.put(plantName, new ArrayList<>());
                    } else {
                        System.out.println("error");
                    }
                    break;
            }
            command = sc.nextLine();
        }
        Map<String, List<Double>> finalMap = new HashMap<>();
        for (Map.Entry<String, List<Integer>> entry : ratingMap.entrySet()) {
            double average = entry.getValue().stream().mapToDouble(a -> a).average().orElse(0.0);
            String name = entry.getKey();
            finalMap.put(name, Arrays.asList(0.0, average));

        }
        for (Map.Entry<String, Integer> entry : rarityMap.entrySet()) {
            int rarity = entry.getValue();
            String name = entry.getKey();
            finalMap.get(name).set(0, (double) rarity);

        }
        System.out.println("Plants for the exhibition:");
        finalMap.entrySet().stream()
                .sorted((left, right) -> {
                    int result = right.getValue().get(0).compareTo(left.getValue().get(0));
                    if (result == 0) {
                        result = right.getValue().get(1).compareTo(left.getValue().get(1));
                    }
                    return result;
                }).forEach(e -> {
            System.out.printf("- %s; Rarity: %.0f; Rating: %.2f%n", e.getKey(), e.getValue().get(0), e.getValue().get(1));

        });

    }
}
