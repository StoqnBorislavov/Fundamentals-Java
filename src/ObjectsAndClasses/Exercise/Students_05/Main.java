package ObjectsAndClasses.Exercise.Students_05;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<Student> students = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String studentData = sc.nextLine();
            String firstName = studentData.split("\\s+")[0];
            String lastName = studentData.split("\\s+")[1];
            double grade = Double.parseDouble(studentData.split("\\s+")[2]);
            Student student = new Student(firstName, lastName, grade);
            students.add(student);
        }
        students.sort(Comparator.comparing(e -> e.getGrade()));
        Collections.reverse(students);
        for (Student student : students) {
            System.out.println(student);

        }
    }
}
