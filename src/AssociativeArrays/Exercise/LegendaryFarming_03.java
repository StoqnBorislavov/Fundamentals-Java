package AssociativeArrays.Exercise;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LegendaryFarming_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        Map<String, Integer> neededItems = new HashMap<>();
        Map<String, Integer> junkItems = new HashMap<>();
        neededItems.put("fragments", 0);
        neededItems.put("shards", 0);
        neededItems.put("motes", 0);
        boolean isFragments = false;
        boolean isShards = false;
        boolean isMotes = false;

        while (true) {
            String[] items = input.split(" ");
            for (int i = 0; i < items.length - 1; i = i + 2) {
                int points = Integer.parseInt(items[i]);
                String currentItem = items[i + 1].toLowerCase();
                switch (currentItem) {
                    case "fragments":
                    case "shards":
                    case "motes":
                        neededItems.put(currentItem, neededItems.get(currentItem) + points);
                        break;
                    default:
                        if (!junkItems.containsKey(currentItem)) {
                            junkItems.put(currentItem, points);
                        } else {
                            junkItems.put(currentItem, junkItems.get(currentItem) + points);
                        }
                        break;
                }
                if (neededItems.containsKey("fragments") && neededItems.get("fragments") >= 250) {
                    isFragments = true;
                    System.out.println("Valanyr obtained!");
                    break;
                }
                if (neededItems.containsKey("shards") && neededItems.get("shards") >= 250) {
                    isShards = true;
                    System.out.println("Shadowmourne obtained!");
                    break;
                }
                if (neededItems.containsKey("motes") && neededItems.get("motes") >= 250) {
                    isMotes = true;
                    System.out.println("Dragonwrath obtained!");
                    break;
                }
            }
            if (isFragments) {
                break;
            }
            if (isMotes) {
                break;
            }
            if (isShards) {
                break;
            }

            input = sc.nextLine();
        }
        if (isFragments) {
            neededItems.put("fragments", neededItems.get("fragments") - 250);
        }
        if (isMotes) {
            neededItems.put("motes", neededItems.get("motes") - 250);
        }
        if (isShards) {
            neededItems.put("shards", neededItems.get("shards") - 250);
        }
        neededItems.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed()
                        .thenComparing(Map.Entry.comparingByKey()))
                .forEach(e -> System.out.println(e.getKey() + ": " + e.getValue()));
        junkItems.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .forEach(e -> System.out.println(e.getKey() + ": " + e.getValue()));
    }
}
