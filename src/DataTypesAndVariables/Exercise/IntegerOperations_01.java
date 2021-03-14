package DataTypesAndVariables.Exercise;

import java.util.Scanner;

public class IntegerOperations_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int firstNumber = Integer.parseInt(sc.nextLine());
        int secondNumber = Integer.parseInt(sc.nextLine());
        int thirdNumber = Integer.parseInt(sc.nextLine());
        int forthNumber = Integer.parseInt(sc.nextLine());

        int result = ((firstNumber + secondNumber) / thirdNumber) * forthNumber;
        System.out.println(result);

    }
}
