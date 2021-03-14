package ObjectsAndClasses.MoreExercise.CompanyRoster_01;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<Employee> employeeList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] input = sc.nextLine().split("\\s+");
            String name = input[0];
            double salary = Double.parseDouble(input[1]);
            String position = input[2];
            String department = input[3];
            if (input.length == 4) {
                Employee employee = new Employee(name, salary, position, department);
                employeeList.add(employee);

            } else if (input.length == 6) {
                String email = input[4];
                int age = Integer.parseInt(input[5]);
                Employee employee = new Employee(name, salary, position, department, email, age);
                employeeList.add(employee);
            } else {
                String text = input[4];
                boolean isAge = true;
                for (int j = 0; j < text.length(); j++) {
                    char c = text.charAt(j);
                    if (c <= '0' || c >= '9') {
                        isAge = false;
                    }
                }
                if (isAge) {
                    int age = Integer.parseInt(input[4]);
                    Employee employee = new Employee(name, salary, position, department, age);
                    employeeList.add(employee);
                } else {
                    String email = input[4];
                    Employee employee = new Employee(name, salary, position, department, email);
                    employeeList.add(employee);
                }
            }
        }
    }
}
