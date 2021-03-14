package Lists.Lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationBasics_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(sc.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        String command = sc.nextLine();
        while (!command.equals("end")) {
            String[] com = command.split(" ");
            switch (com[0]) {
                case "Add":
                    int numberToAdd = Integer.parseInt(com[1]);
                    numbers.add(numberToAdd);
                    break;
                case "Remove":
                    int numberToRemove = Integer.parseInt(com[1]);
                    numbers.remove(Integer.valueOf(numberToRemove));
                    break;
                case "RemoveAt":
                    int indexToRemove = Integer.parseInt(com[1]);
                    numbers.remove(indexToRemove);
                    break;
                case "Insert":
                    int numberToSet = Integer.parseInt(com[1]);
                    int indexToSet = Integer.parseInt(com[2]);
                    numbers.add(indexToSet, numberToSet);
                    break;

            }
            command = sc.nextLine();
        }
        System.out.println(numbers.toString().replaceAll("[\\[\\],]", ""));
    }
}
