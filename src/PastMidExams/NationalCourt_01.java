package PastMidExams;

import java.util.Scanner;

public class NationalCourt_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int firstEmployee = Integer.parseInt(sc.nextLine());
        int secondEmployee = Integer.parseInt(sc.nextLine());
        int thirdEmployee = Integer.parseInt(sc.nextLine());
        int allPeople = Integer.parseInt(sc.nextLine());
        int time = 0;
        while (allPeople > 0) {
            time++;
            if (time % 4 != 0) {
                allPeople = allPeople - firstEmployee - secondEmployee - thirdEmployee;
            }
        }
        System.out.printf("Time needed: %dh.", time);
    }
}
