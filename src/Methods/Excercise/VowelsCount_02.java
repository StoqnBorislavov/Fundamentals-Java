package Methods.Excercise;

import java.util.Scanner;

public class VowelsCount_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        findNumberOfVowels(text);
    }

    private static void findNumberOfVowels(String text) {
        int sumOfVowels = 0;
        for (int i = 0; i < text.length(); i++) {
            char digit = text.charAt(i);
            if(digit == 65 || digit == 69 || digit == 73 || digit == 79 || digit == 85
            || digit == 97 || digit == 101 || digit == 105 || digit == 111 || digit == 117){
                sumOfVowels ++;
            }
        }
        System.out.println(sumOfVowels);
    }
}
