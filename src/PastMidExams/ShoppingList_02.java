package PastMidExams;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ShoppingList_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> groceries = Arrays.stream(sc.nextLine().split("!"))
                .collect(Collectors.toList());

        String command = sc.nextLine();
        while (!command.equals("Go Shopping!")) {
            String realCommand = command.split("\\s+")[0];
            String item = command.split("\\s+")[1];
            switch (realCommand) {
                case "Urgent":
                    if (!groceries.contains(item)) {
                        groceries.add(0, item);
                    }
                    break;
                case "Unnecessary":
                    if (groceries.contains(item)) {
                        groceries.remove(item);
                    }
                    break;
                case "Correct":
                    String newItem = command.split("\\s+")[2];
                    if (groceries.contains(item)) {
                        groceries.set(groceries.indexOf(item), newItem);
                    }
                    break;
                case "Rearrange":
                    if (groceries.contains(item)) {
                        groceries.remove(item);
                        groceries.add(item);
                    }
                    break;
            }
            command = sc.nextLine();
        }
        for (int i = 0; i < groceries.size(); i++) {
            if (i == groceries.size() - 1) {
                System.out.print(groceries.get(i));
            } else {
                System.out.print(groceries.get(i) + ", ");
            }
        }
    }
}
