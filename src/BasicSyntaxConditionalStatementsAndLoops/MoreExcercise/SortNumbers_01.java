package BasicSyntaxConditionalStatementsAndLoops.MoreExcercise;

import java.util.Scanner;

public class SortNumbers_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int first = Integer.parseInt(sc.nextLine());
        int second = Integer.parseInt(sc.nextLine());
        int third = Integer.parseInt(sc.nextLine());
        int temp;
        if(first < second){
            temp = second;
            second = first;
            first = temp;
        }
        if(second < third){
            temp = third;
            third = second;
            second = temp;
        }
        if(first < second){
            temp = second;
            second = first;
            first = temp;
        }
        System.out.println(first);
        System.out.println(second);
        System.out.println(third);

    }
}
