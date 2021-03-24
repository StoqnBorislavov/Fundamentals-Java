package PastFinalExams;

import java.util.Scanner;

public class ActivationKeys_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        StringBuilder rawKey = new StringBuilder(sc.nextLine());

        String input = sc.nextLine();

        while (!input.equals("Generate")) {
            String[] commandList = input.split(">>>");
            String nameCommand = commandList[0];
            switch (nameCommand) {
                case "Contains":
                    String substring = commandList[1];
                    if (rawKey.indexOf(substring) != -1) {
                        System.out.printf("%s contains %s%n", rawKey, substring);
                    } else {
                        System.out.println("Substring not found!");
                    }
                    break;
                case "Flip":
                    String subCommand = commandList[1];
                    int startIndex = Integer.parseInt(commandList[2]);
                    int endIndex = Integer.parseInt(commandList[3]);
                    for (int i = startIndex; i < endIndex; i++) {
                        char currentChar = rawKey.charAt(i);
                        if (subCommand.equals("Upper")) {
                            rawKey.setCharAt(i, Character.toUpperCase(currentChar));
                        } else {
                            rawKey.setCharAt(i, Character.toLowerCase(currentChar));
                        }
                    }
                    System.out.println(rawKey);
                    break;
                case "Slice":
                    int startIndexToDelete = Integer.parseInt(commandList[1]);
                    int endIndexToDelete = Integer.parseInt(commandList[2]);
                    rawKey.delete(startIndexToDelete, endIndexToDelete);
                    System.out.println(rawKey);
                    break;
            }
            input = sc.nextLine();
        }
        System.out.printf("Your activation key is: %s", rawKey);
    }
}
