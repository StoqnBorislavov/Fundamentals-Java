package PastFinalExams;

import java.util.Scanner;

public class WorldTour_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder input = new StringBuilder(sc.nextLine());

        String command = sc.nextLine();
        while (!command.equals("Travel")) {
            String[] commandList = command.split(":");
            String commandName = commandList[0];
            switch (commandName) {
                case "Add Stop":
                    int index = Integer.parseInt(commandList[1]);
                    String textForInsert = commandList[2];
                    if (isIndexValid(index, input)) {
                        input.insert(index, textForInsert);
                    }
                    System.out.println(input);
                    break;
                case "Remove Stop":
                    int startIndex = Integer.parseInt(commandList[1]);
                    int endIndex = Integer.parseInt(commandList[2]);
                    if (isIndexValid(startIndex, input) && isIndexValid(endIndex, input)) {
                        input.delete(startIndex, endIndex + 1);
                    }
                    System.out.println(input);
                    break;
                case "Switch":
                    String oldString = commandList[1];
                    String newString = commandList[2];
                    if (input.toString().contains(oldString)) {
                        String text = input.toString().replace(oldString, newString);
                        input = new StringBuilder(text);
                    }
                    System.out.println(input);
                    break;
            }
            command = sc.nextLine();
        }
        System.out.printf("Ready for world tour! Planned stops: %s", input);
    }

    private static boolean isIndexValid(int index, StringBuilder string) {
        return index >= 0 && index < string.length();
    }
}
