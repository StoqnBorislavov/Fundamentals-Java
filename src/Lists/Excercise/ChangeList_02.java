package Lists.Excercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ChangeList_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(sc.nextLine()
                .split("\\s+")).map(e -> Integer.parseInt(e))
                .collect(Collectors.toList());
        String input = sc.nextLine();
        while(!input.equals("end")){
            String command = input.split("\\s+")[0];
            int element = Integer.parseInt(input.split("\\s+")[1]);
            if(command.equals("Delete")){
                numbers.removeAll(Arrays.asList(element));
            } else if (command.equals("Insert")){
                int index = Integer.parseInt(input.split("\\s+")[2]);
                numbers.add(index, element);
            }
            input = sc.nextLine();
        }
        printList(numbers);
    }

    private static void printList(List<Integer> numbers) {
        for(int number : numbers){
            System.out.print(number + " ");
        }
    }
}
