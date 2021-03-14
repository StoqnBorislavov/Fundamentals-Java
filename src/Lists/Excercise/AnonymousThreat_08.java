package Lists.Excercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AnonymousThreat_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        List<String> items = Arrays.stream(input.split("\\s+"))
                .collect(Collectors.toList());
        String command = sc.nextLine();
        while (!command.equals("3:1")) {
            String[] tokens = command.split("\\s+");
            String realCommand = tokens[0];
            switch (realCommand) {
                case "merge":
                    int startIndex = Integer.parseInt(tokens[1]);
                    int endIndex = Integer.parseInt(tokens[2]);
                    if (startIndex < 0) {
                        startIndex = 0;
                    }
                    if (endIndex > items.size() - 1) {
                        endIndex = items.size() - 1;
                    }
                    for (int i = startIndex + 1; i <= endIndex; i++) {
                        items.set(startIndex, items.get(startIndex) + items.get(i));

                    }
                    int count = 0;
                    for (int i = startIndex + 1; i <= endIndex - count; i++) {
                        items.remove(i);
                        count++;
                        i--;
                    }
                    break;
                case "divide":
                    int indexOnElementForDivide = Integer.parseInt(tokens[1]);
                    int partitions = Integer.parseInt(tokens[2]);
                    int numberOfSymbols = items.get(indexOnElementForDivide).length() / partitions;
                    int leftover = items.get(indexOnElementForDivide).length() % partitions;
                    if (leftover == 0) {
                        String stringForDivide = items.get(indexOnElementForDivide);
                        int newItems = 0;
                        for (int i = 0; i < items.get(indexOnElementForDivide).length(); i = i + numberOfSymbols) {
                            newItems++;
                            String item = "";
                            for (int j = i; j < i + numberOfSymbols; j++) {
                                item += stringForDivide.charAt(j);
                            }
                            if (indexOnElementForDivide == items.size() - 1) {
                                items.add(item);
                            } else {
                                items.add(indexOnElementForDivide + newItems, item);
                            }

                        }
                        items.remove(indexOnElementForDivide);
                    } else {
                        String stringForDivide = items.get(indexOnElementForDivide);
                        int newItems = 0;
                        for (int i = 0; i < items.get(indexOnElementForDivide).length(); i = i + numberOfSymbols) {
                            newItems++;
                            String item = "";
                            if (i < stringForDivide.length() - (numberOfSymbols + leftover)) {
                                for (int j = i; j < i + numberOfSymbols; j++) {
                                    item += stringForDivide.charAt(j);
                                }
                                if (indexOnElementForDivide == items.size() - 1) {
                                    items.add(item);
                                } else {
                                    items.add(indexOnElementForDivide + newItems, item);
                                }
                            } else {
                                for (int j = i; j < i + numberOfSymbols + leftover; j++) {
                                    item += stringForDivide.charAt(j);
                                }
                                if (indexOnElementForDivide == items.size() - 1) {
                                    items.add(item);
                                } else {
                                    items.add(indexOnElementForDivide + newItems, item);
                                }
                                i += numberOfSymbols + leftover;
                            }
                        }
                        items.remove(indexOnElementForDivide);
                    }
                    break;
            }
            command = sc.nextLine();
        }
        for (String item : items) {
            System.out.print(item + " ");

        }


    }
}
