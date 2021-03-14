package DataTypesAndVariables.Exercise;

import java.util.Scanner;

public class PokeMon_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int power =Integer.parseInt(sc.nextLine());
        int distance = Integer.parseInt(sc.nextLine());
        int exhaustionFactor = Integer.parseInt(sc.nextLine());
        double half = power / 2.0;
        int count = 0;
        while (power >= distance){
            power -= distance;
            count++;
            if(power == half){
                if(exhaustionFactor > 0) {
                    power /= exhaustionFactor;
                }
            }
        }
        System.out.println(power);
        System.out.println(count);
    }
}
