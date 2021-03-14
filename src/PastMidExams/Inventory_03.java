package PastMidExams;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Inventory_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> inventory = Arrays.stream(sc.nextLine().split(", "))
                .collect(Collectors.toList());
        String[] command = sc.nextLine().split(" - ");

        while (!command[0].equals("Craft!")) {
            String currentCommand = command[0];
            switch (currentCommand) {
                case "Collect":
                    String item = command[1];
                    if (!inventory.contains(item)) {
                        inventory.add(item);
                    }
                    break;
                case "Drop":
                    String item1 = command[1];
                    if (inventory.contains(item1)) {
                        inventory.remove(item1);
                    }
                    break;
                case "Combine Items":
                    String[] text = command[1].split(":");
                    String oldItem = text[0];
                    String newItem = text[1];
                    if (inventory.contains(oldItem)) {
                        inventory.add(inventory.indexOf(oldItem) + 1, newItem);
                    }
                    break;
                case "Renew":
                    String item2 = command[1];
                    if (inventory.contains(item2)) {
                        inventory.remove(item2);
                        inventory.add(item2);
                    }
                    break;
            }


            command = sc.nextLine().split(" - ");
        }
        for (int i = 0; i < inventory.size(); i++) {
            String item = inventory.get(i);
            if (i == inventory.size() - 1) {
                System.out.print(item);
            } else {
                System.out.print(item + ", ");
            }

        }
    }
}
