package DataTypesAndVariables.MoreExcercise;

import java.util.Scanner;

public class FromLeftToTheRight_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int sumOfDigits = 0;
        String firstNumber = "";
        String secondNumber = "";
        boolean isSecond = false;
        for (int i = 0; i < n; i++) {
            String numbers = sc.nextLine();
            for (int j = 0; j < numbers.length(); j++) {
                String character = "" + numbers.charAt(j);
                if(!character.equals(" ") && !isSecond){
                    firstNumber += character;
                } else if (character.equals(" ")){
                    isSecond = true;
                    continue;
                }
                if(isSecond){
                    secondNumber += character;
                }
            }
            long firstNumberInInt = Long.parseLong(firstNumber);
            long secondNumberInInt = Long.parseLong(secondNumber);
            if(firstNumberInInt > secondNumberInInt) {
                while (firstNumberInInt != 0) {
                    sumOfDigits += firstNumberInInt % 10;
                    firstNumberInInt /= 10;
                }
            } else {
                while (secondNumberInInt != 0) {
                    sumOfDigits += secondNumberInInt % 10;
                    secondNumberInInt /= 10;
                }
            }
            System.out.println(Math.abs(sumOfDigits));
            sumOfDigits = 0;
            firstNumber = "";
            secondNumber = "";
            isSecond = false;
        }
    }
}
