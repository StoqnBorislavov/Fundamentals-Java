package PastFinalExams;

import java.util.Scanner;

public class PasswordReset_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder password = new StringBuilder(sc.nextLine());

        String input = sc.nextLine();

        while (!input.equals("Done")) {
            String[] commandList = input.split(" ");
            String commandName = commandList[0];
            switch (commandName) {
                case "TakeOdd":
                    StringBuilder newPass = new StringBuilder();
                    for (int i = 0; i < password.length(); i++) {
                        if ((i + 1) % 2 == 0) {
                            char current = password.charAt(i);
                            newPass.append(current);
                        }
                    }
                    password = newPass;
                    System.out.println(password);
                    break;
                case "Cut":
                    int indexForCut = Integer.parseInt(commandList[1]);
                    int length = Integer.parseInt(commandList[2]);
                    password.delete(indexForCut, indexForCut + length);
                    System.out.println(password);
                    break;
                case "Substitute":
                    String substring = commandList[1];
                    String substitute = commandList[2];
                    String pass = password.toString();
                    if (pass.contains(substring)) {
                        pass = password.toString().replace(substring, substitute);
                        password = new StringBuilder(pass);
                        System.out.println(password);
                    } else {
                        System.out.println("Nothing to replace!");
                    }
                    break;
            }
            input = sc.nextLine();
        }
        System.out.printf("Your password is: %s%n", password);
    }
}
