package ObjectsAndClasses.MoreExercise.CompanyRoster_01;

public class Employee {
    //name, salary, position, department, email and age.
    // The name, salary, position and department are mandatory while the rest are optional
    private String name;
    private double salary;
    private String position;
    private String department;
    private String email;
    private int age;

    public String getDepartment() {
        return department;
    }

    public Employee(String name, double salary, String position, String department, String email, int age) {
        this.name = name;
        this.salary = salary;
        this.position = position;
        this.department = department;
        this.email = email;
        this.age = age;
    }

    public Employee(String name, double salary, String position, String department) {
        this.name = name;
        this.salary = salary;
        this.position = position;
        this.department = department;
        this. email = "n/a";
        this.age = -1;
    }

    public Employee(String name, double salary, String position, String department, int age) {
        this.name = name;
        this.salary = salary;
        this.position = position;
        this.department = department;
        this.age = age;
        this. email = "n/a";
    }

    public Employee(String name, double salary, String position, String department, String email) {
        this.name = name;
        this.salary = salary;
        this.position = position;
        this.department = department;
        this.email = email;
        this.age = -1;
    }
}
