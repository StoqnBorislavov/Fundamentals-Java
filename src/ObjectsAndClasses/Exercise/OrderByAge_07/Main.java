package ObjectsAndClasses.Exercise.OrderByAge_07;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Person> people = new ArrayList<>();
        String[] input = sc.nextLine().split("\\s+");

        while (!input[0].equals("End")) {
            String name = input[0];
            String id = input[1];
            int age = Integer.parseInt(input[2]);
            Person person = new Person(name, id, age);
            people.add(person);
            input = sc.nextLine().split("\\s+");
        }
        people.sort(Comparator.comparing(e -> e.getAge()));
        for (Person person : people) {
            System.out.println(person);
        }
    }
}
