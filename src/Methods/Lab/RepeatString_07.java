package Methods.Lab;

import java.util.Scanner;

public class RepeatString_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        int repetitions = Integer.parseInt(sc.nextLine());

        String repeatedString = repeatString(text, repetitions);
        System.out.println(repeatedString);
    }

    private static String repeatString(String text, int repetitions) {
        String result = "";
        for (int i = 0; i < repetitions; i++) {
            result += text;

        }
        return result;
    }
}
