package BitwiseOperation;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = Integer.parseInt(sc.nextLine());
        int binaryNumber = Integer.parseInt(sc.nextLine());

        int count = 0;
        while (number > 0){
            int leftover = number % 2;
            if(leftover == binaryNumber){
                count++;
            }
            number /= 2;
        }
        System.out.println(count);
    }
}
