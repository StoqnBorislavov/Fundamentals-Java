package Methods.Excercise;

import java.util.Scanner;

import static java.lang.Integer.sum;

public class AddAndSubtract_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int firstNumber = Integer.parseInt(sc.nextLine());
        int secondNumber = Integer.parseInt(sc.nextLine());
        int thirdNumber = Integer.parseInt(sc.nextLine());
        int sumOfFirstTwo = sumFirstTwo(firstNumber, secondNumber);
        subtractSumsFromThird(sumOfFirstTwo, thirdNumber);
    }

    private static void subtractSumsFromThird(int sumOfFirstTwo, int thirdNumber) {
        System.out.println(sumOfFirstTwo - thirdNumber);
    }

    private static int sumFirstTwo(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }
}
