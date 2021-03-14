package DataTypesAndVariables.Exercise;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class WaterOverflow_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int capacity = 255;

        for (int i = 0; i < n; i++) {
            int litters = Integer.parseInt(sc.nextLine());
            if(capacity >= litters){
                capacity-= litters;
            }else{
                System.out.println("Insufficient capacity!");
            }
        }
        System.out.println(255 - capacity);


    }
}
