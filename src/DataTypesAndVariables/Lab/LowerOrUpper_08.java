package DataTypesAndVariables.Lab;

import java.util.Scanner;

public class LowerOrUpper_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char character = sc.nextLine().charAt(0);
        int asciiCode = (int) character;
        if(asciiCode >= 65 && asciiCode <= 90){
            System.out.println("upper-case");
        } else {
            System.out.println("lower-case");
        }
    }
}
