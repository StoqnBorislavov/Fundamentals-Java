package TextProcessing.Exercise;

import java.util.Scanner;

public class ReplaceRepeatingChars_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder input = new StringBuilder(sc.nextLine());

        for (int i = 0; i < input.length() - 1; i++) {
            if(input.charAt(i) == input.charAt(i + 1)){
                input.deleteCharAt(i);
                i--;
            }
        }
        System.out.println(input);
    }
}
