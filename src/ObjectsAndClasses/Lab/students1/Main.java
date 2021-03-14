package ObjectsAndClasses.Lab.students1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        List<Student> students = new ArrayList<>();
        while(!input.equals("end")){
            String[] studentData = input.split(" ");
            String firstName = studentData[0];
            String lastName = studentData[1];
            int age = Integer.parseInt(studentData[2]);
            String city = studentData[3];

            if(IsStudentExisting(students, firstName, lastName)){
                Student student = getStudent(students, firstName, lastName);
                student.setFirstName(firstName);
                student.setLastName(lastName);
                student.setAge(age);
                student.setCity(city);
            } else{
                Student student = new Student(firstName, lastName, age, city);
                students.add(student);
            }
            input = sc.nextLine();
        }
        String filterCity = sc.nextLine();
        for (Student student : students) {
            if(student.getCity().equals(filterCity)){
                System.out.printf("%s %s is %d years old%n", student.getFirstName(), student.getLastName(), student.getAge());
            }

        }
    }
    private static Student getStudent(List<Student> students, String firstName, String lastName){
        Student existingStudent = null;
        for (Student student : students) {
            if(student.getFirstName().equals(firstName) && student.getLastName().equals(lastName)){
                existingStudent = student;
            }
        }
        return existingStudent;
    }
    public static boolean IsStudentExisting(List<Student> students, String firstName, String lastName){
        for (Student student : students) {
            if(student.getFirstName().equals(firstName) && student.getLastName().equals(lastName)){
                return true;
            }
        }
        return false;
    }
}

