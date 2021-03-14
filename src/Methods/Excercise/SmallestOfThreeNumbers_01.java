package Methods.Excercise;

import java.util.Scanner;

public class SmallestOfThreeNumbers_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int firstInteger = Integer.parseInt(sc.nextLine());
        int secondInteger = Integer.parseInt(sc.nextLine());
        int thirdInteger = Integer.parseInt(sc.nextLine());
        findTheSmallestElement(firstInteger, secondInteger, thirdInteger);
    }

    private static void findTheSmallestElement(int firstInteger, int secondInteger, int thirdInteger) {
        int min = Integer. MAX_VALUE;
        if(firstInteger < secondInteger){
            if(firstInteger < thirdInteger){
                min = firstInteger;
            } else {
                min = thirdInteger;
            }
        } else {
            if(secondInteger <thirdInteger){
                min = secondInteger;
            } else{
                min = thirdInteger;
            }
        }
        System.out.println(min);
    }
}
