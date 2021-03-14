package Lists.Lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationAdvanced_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(sc.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        String command = sc.nextLine();
        while (!command.equals("end")) {
            String[] com = command.split(" ");
            switch (com[0]) {
                case "Contains":
                    if (numbers.contains(Integer.valueOf(com[1]))) {
                        System.out.println("Yes");
                    } else {
                    System.out.println("No such number");
                }
                    break;
                case "Print":
                    if (com[1].equals("even")) {
                        for (int i = 0; i < numbers.size(); i++) {
                            if (numbers.get(i) % 2 == 0) {
                                System.out.print(numbers.get(i) + " ");
                            }
                        }
                        System.out.println();
                    } else {
                        for (int i = 0; i < numbers.size(); i++) {
                            if (numbers.get(i) % 2 == 1) {
                                System.out.print(numbers.get(i) + " ");
                            }
                        }
                        System.out.println();

                    }
                    break;
                case "Get":
                    int sum = 0;
                    for (int i = 0; i < numbers.size(); i++) {
                        sum += numbers.get(i);
                    }
                    System.out.println(sum);
                    break;
                case "Filter":
                    if (com[1].equals("<")) {
                        int number = Integer.parseInt(com[2]);
                        for (int i = 0; i < numbers.size(); i++) {
                            if (numbers.get(i) < number) {
                                System.out.print(numbers.get(i) + " ");
                            }
                        }
                        System.out.println();
                    } else if (com[1].equals(">")) {
                        int number = Integer.parseInt(com[2]);
                        for (int i = 0; i < numbers.size(); i++) {
                            if (numbers.get(i) > number) {
                                System.out.print(numbers.get(i) + " ");
                            }
                        }
                        System.out.println();
                    } else if (com[1].equals(">=")) {
                        int number = Integer.parseInt(com[2]);
                        for (int i = 0; i < numbers.size(); i++) {
                            if (numbers.get(i) >= number) {
                                System.out.print(numbers.get(i) + " ");
                            }
                        }
                        System.out.println();
                    } else if (com[1].equals("<=")) {
                        int number = Integer.parseInt(com[2]);
                        for (int i = 0; i < numbers.size(); i++) {
                            if (numbers.get(i) <= number) {
                                System.out.print(numbers.get(i) + " ");
                            }
                        }
                        System.out.println();
                    }
                    break;
            }
            command = sc.nextLine();
        }
    }
}
