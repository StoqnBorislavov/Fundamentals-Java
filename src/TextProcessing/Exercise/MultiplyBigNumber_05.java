package TextProcessing.Exercise;

import java.math.BigInteger;
import java.util.Scanner;

public class MultiplyBigNumber_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String firstNum = sc.nextLine();
        firstNum = firstNum.replaceAll("^0+", "");
        int secondNum = Integer.parseInt(sc.nextLine());
        StringBuilder bigInteger = new StringBuilder();
        int forRemember = 0;
        int result = 0;
        String sign = "";
        if (secondNum > 0 && !firstNum.equals("0")) {
            if (firstNum.charAt(0) == '-') {
                sign = "-";
                firstNum = firstNum.substring(1, firstNum.length());
            }
            while (!firstNum.isEmpty()) {
                //24*8=2
                int first = Integer.parseInt(String.valueOf(firstNum.charAt(firstNum.length() - 1)));
                int multiply = (first * secondNum) + forRemember;

                if (multiply >= 10) {
                    result = multiply % 10;
                    forRemember = multiply / 10;
                } else {
                    result = multiply;
                    forRemember = 0;
                }
                bigInteger.append(result);
                firstNum = firstNum.substring(0, firstNum.length() - 1);
            }
            if (forRemember > 0) {
                bigInteger.append(forRemember);
            }
        } else {
            bigInteger.append(0);
        }
        System.out.println(!sign.isEmpty() ? sign + bigInteger.reverse() : bigInteger.reverse());
    }
}
