package TextProcessing.Exercise;

import java.util.Scanner;

public class CharacterMultiplier_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] input =sc.nextLine().split(" ");
        String first = input[0];
        String second = input[1];

        charCodesMultiply(first, second);
    }

    private static void charCodesMultiply(String first, String second) {
        if(first.length() < second.length()){
            findMultiplication(first, second);
        } else {
            findMultiplication(second, first);
        }
    }

    private static void findMultiplication(String smaller, String bigger) {
        int result = 0;
        for (int i = 0; i < smaller.length(); i++) {
            int currentCharCodeInSmaller = (int)smaller.charAt(i);
            int currentCharCodeInBigger = (int)bigger.charAt(i);
            result += currentCharCodeInSmaller * currentCharCodeInBigger;
        }
        for (int i = smaller.length(); i < bigger.length(); i++) {
            int lastCodes = (int)bigger.charAt(i);
            result += lastCodes;
        }
        System.out.println(result);
    }
}
