package BasicSyntaxConditionalStatementsAndLoops.MoreExcercise;

import java.util.Scanner;

public class ReverseString_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String normalString = sc.nextLine();
        StringBuilder reversedString = new StringBuilder();
        for (int i = normalString.length() - 1; i >= 0; i--) {
            char symbol = normalString.charAt(i);
            reversedString.append(symbol);
        }
        System.out.println(reversedString.toString());
    }
}
