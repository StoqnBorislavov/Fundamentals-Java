package PastFinalExams;

import java.util.Scanner;

public class SecretChat_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String command = sc.nextLine();

        while (!command.equals("Reveal")) {
            String[] comm = command.split(":\\|:");
            String realCommand = comm[0];
            switch (realCommand) {
                case "InsertSpace":
                    int index = Integer.parseInt(comm[1]);
                    input = input.substring(0, index) + " " + input.substring(index);
                    System.out.println(input);
                    break;
                case "Reverse":
                    String substring = comm[1];
                    StringBuilder reversedSubstring = new StringBuilder(substring);
                    if (input.contains(substring)) {
                        input = input.replace(substring, "") + reversedSubstring.reverse();
                        System.out.println(input);
                    } else {
                        System.out.println("error");
                    }
                    break;
                case "ChangeAll":
                    String substringForChange = comm[1];
                    String replacement = comm[2];
                    input = input.replaceAll(substringForChange, replacement);
                    System.out.println(input);
                    break;
            }
            command = sc.nextLine();
        }
        System.out.printf("You have a new text message: %s", input);
    }
}
