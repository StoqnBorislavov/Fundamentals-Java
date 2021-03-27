import java.math.BigInteger;
import java.util.Scanner;

public class TheImitationGame_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder message = new StringBuilder(sc.nextLine());

        String input = sc.nextLine();

        while (!input.equals("Decode")) {
            String[] commandList = input.split("\\|");
            String commandName = commandList[0];
            switch (commandName) {
                //            •	Move {number of letters}
                //             o	Moves the first n letters to the back of the string.
                case "Move":
                    int numberOfLetters = Integer.parseInt(commandList[1]);
                    String textForEnd = message.substring(0, numberOfLetters);
                    message.delete(0, numberOfLetters);
                    message.append(textForEnd);
                    break;
                //            •	Insert {index} {value}
                //             o	Inserts the given value before the given index in the string.
                case "Insert":
                    int index = Integer.parseInt(commandList[1]);
                    String value = commandList[2];
                    message.insert(index, value);
                    break;
                //            •	ChangeAll {substring} {replacement}
                //             o	Changes all occurrences of the given substring with the replacement text.
                case "ChangeAll":
                    String substring = commandList[1];
                    String replacement = commandList[2];
                    String newMassage = message.toString().replace(substring, replacement);
                    message = new StringBuilder(newMassage);
                    break;
            }
            input = sc.nextLine();
        }
        System.out.printf("The decrypted message is: %s", message);
    }
}
