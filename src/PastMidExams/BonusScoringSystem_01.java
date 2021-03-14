package PastMidExams;

import java.util.Scanner;

public class BonusScoringSystem_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int studentsCount = Integer.parseInt(sc.nextLine());
        int lecturesCount = Integer.parseInt(sc.nextLine());
        int initialBonus = Integer.parseInt(sc.nextLine());
        int maxBonus = 0;
        int currentLectureAttendance = 0;
        for (int i = 0; i < studentsCount; i++) {
            int currentStudentAttendance = Integer.parseInt(sc.nextLine());
            int totalBonus = (int) Math.ceil(currentStudentAttendance * 1.0 / lecturesCount * (5 + initialBonus));
            if (totalBonus > maxBonus) {
                maxBonus = totalBonus;
                currentLectureAttendance = currentStudentAttendance;
            }
        }
        System.out.printf("Max Bonus: %d.%n", maxBonus);
        System.out.printf("The student has attended %d lectures.", currentLectureAttendance);

    }
}
