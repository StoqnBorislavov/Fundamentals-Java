package ObjectsAndClasses.Exercise.OpinionPoll;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collector;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<Person> people = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String personalData = sc.nextLine();
            String name = personalData.split("\\s+")[0];
            int age = Integer.parseInt(personalData.split("\\s+")[1]);

            if (age > 30) {
                Person person = new Person(name, age);
                people.add(person);
            }
        }
        people.sort(Comparator.comparing(p -> p.getName()));

        for (Person person : people) {
            System.out.println(person);

        }
    }
}
