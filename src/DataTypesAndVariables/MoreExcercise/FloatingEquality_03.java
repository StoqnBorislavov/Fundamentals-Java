package DataTypesAndVariables.MoreExcercise;

import java.math.BigDecimal;
import java.util.Scanner;

public class FloatingEquality_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double number1 = Double.parseDouble(sc.nextLine());
        double number2 = Double.parseDouble(sc.nextLine());
        BigDecimal eps = new BigDecimal(0.000001);
        BigDecimal num1 = new BigDecimal(number1);
        BigDecimal num2 = new BigDecimal(number2);
        BigDecimal num3 = num1.subtract(num2);
        BigDecimal numAbs;
        numAbs = num3.abs();
         int p = numAbs.compareTo(eps);
         if(p == -1){
             System.out.println("True");
        } else {
             System.out.println("False");
         }
    }
}
