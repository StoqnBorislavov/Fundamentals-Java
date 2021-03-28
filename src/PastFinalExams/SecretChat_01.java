package PastFinalExams;

import java.util.Scanner;

public class SecretChat_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder input = new StringBuilder(sc.nextLine());
        String command = sc.nextLine();

        while (!command.equals("Reveal")) {
            String[] comm = command.split(":\\|:");
            String realCommand = comm[0];
            switch (realCommand) {
                case "InsertSpace":
                    int index = Integer.parseInt(comm[1]);
                    input.insert(index, " ");
                    System.out.println(input);
                    break;
                case "Reverse":
                    String substring = comm[1];
                    StringBuilder reversedSubstring = new StringBuilder(substring);
                    if (input.toString().contains(substring)) {
                        input.delete(input.indexOf(substring), input.indexOf(substring) + substring.length());
                        input.append(reversedSubstring.reverse());
                        System.out.println(input);
                    } else {
                        System.out.println("error");
                    }
                    break;
                case "ChangeAll":
                    String substringForChange = comm[1];
                    String replacement = comm[2];
                    String text = input.toString().replaceAll(substringForChange, replacement);
                    input = new StringBuilder(text);
                    System.out.println(input);
                    break;
            }
            command = sc.nextLine();
        }
        System.out.printf("You have a new text message: %s", input);
    }
}
