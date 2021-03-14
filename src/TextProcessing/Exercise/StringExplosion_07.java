package TextProcessing.Exercise;

import java.util.Scanner;

public class StringExplosion_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        StringBuilder input = new StringBuilder(sc.nextLine());
        int strength = 0;

        for (int i = 0; i < input.length(); i++) {
            char currentSymbol = input.charAt(i);
            if (currentSymbol == '>' && i < input.length() - 1) {
                if (input.charAt(i + 1) == 0) {
                    break;
                }
                strength += Integer.parseInt(input.charAt(i + 1) + "");
                int count = 0;
                for (int j = i + 1; j < i + 1 + strength; j++) {
                    if (j < input.length() && input.charAt(j) != '>') {
                        input.replace(j, j + 1, "*");
                        count++;
                    } else {
                        break;
                    }
                }
                strength -= count;

            }
        }
        System.out.println(input.toString().replace("*", ""));
    }
}
