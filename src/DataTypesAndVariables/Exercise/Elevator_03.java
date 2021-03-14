package DataTypesAndVariables.Exercise;

import java.util.Scanner;

public class Elevator_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfPeople = Integer.parseInt(sc.nextLine());
        int capacity = Integer.parseInt(sc.nextLine());
        double courses = Math.ceil(numberOfPeople * 1.0 /capacity);
        System.out.printf("%.0f", courses);
    }
}
