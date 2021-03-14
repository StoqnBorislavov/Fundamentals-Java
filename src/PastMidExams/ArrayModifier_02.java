package PastMidExams;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ArrayModifier_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        •	“swap {index1} {index2}” take two elements and swap their places.
//•	“multiply {index1} {index2}” take element at the 1st index and multiply it with element at 2nd index. Save the product at the 1st index.
//•	“decrease” decreases all elements in the array with 1.
        List<Integer> initialArray = Arrays.stream(sc.nextLine().split("\\s+"))
                .map(e -> Integer.parseInt(e)).collect(Collectors.toList());

        String input = sc.nextLine();

        while (!input.equals("end")) {
            String command = input.split("\\s+")[0];
            switch (command) {
                case "swap":
                    int firstIndex = Integer.parseInt(input.split("\\s+")[1]);
                    int secondIndex = Integer.parseInt(input.split("\\s+")[2]);
                    int firstElement = initialArray.get(firstIndex);
                    int secondElement = initialArray.get(secondIndex);
                    initialArray.set(secondIndex, firstElement);
                    initialArray.set(firstIndex, secondElement);
                    break;
                case "multiply":
                    int firstIndexForMultiply = Integer.parseInt(input.split("\\s+")[1]);
                    int secondIndexForMultiply = Integer.parseInt(input.split("\\s+")[2]);
                    int firstElementForMultiply = initialArray.get(firstIndexForMultiply);
                    int secondElementForMultiply = initialArray.get(secondIndexForMultiply);
                    initialArray.set(firstIndexForMultiply, firstElementForMultiply * secondElementForMultiply);
                    break;
                case "decrease":
                    for (int i = 0; i < initialArray.size(); i++) {
                        initialArray.set(i, initialArray.get(i) - 1);
                    }
                    break;
            }
            input = sc.nextLine();
        }
        for (int i = 0; i < initialArray.size(); i++) {
            if (i == initialArray.size() - 1) {
                System.out.print(initialArray.get(i));
            } else {
                System.out.print(initialArray.get(i) + ", ");
            }
        }

    }
}
