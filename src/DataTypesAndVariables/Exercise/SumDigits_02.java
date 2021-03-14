package DataTypesAndVariables.Exercise;

import java.util.Scanner;

public class SumDigits_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = Integer.parseInt(sc.nextLine());
        int sum = 0;

        while(number>0){
            sum = sum + number % 10;
            number = number / 10;
        }
        System.out.println(sum);
    }
}
