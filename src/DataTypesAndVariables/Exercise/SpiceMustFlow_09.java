package DataTypesAndVariables.Exercise;

import java.util.Scanner;

public class SpiceMustFlow_09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int startingYield = Integer.parseInt(sc.nextLine());
        int sum = 0;
        int days = 0;
        while (startingYield >= 100){
            sum += startingYield;
            startingYield -= 10;
            days++;
            sum -= 26;
        }
        if(sum >= 26) {
            sum -= 26;
        } else{
            sum = 0;
        }
        System.out.println(days);
        System.out.println(sum);
    }
}
