package BasicSyntaxConditionalStatementsAndLoops.Lab;

import java.util.Scanner;

public class StudentInformation_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        "Name: {student name}, Age: {student age}, Grade: {student grade}".
        String name = sc.nextLine();
        int age = Integer.parseInt(sc.nextLine());
        double grade = Double.parseDouble(sc.nextLine());
        System.out.printf("Name: %s, Age: %d, Grade: %.2f", name, age, grade);
    }
}
