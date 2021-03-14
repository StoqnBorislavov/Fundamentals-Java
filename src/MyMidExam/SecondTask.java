package MyMidExam;

import com.sun.source.tree.WhileLoopTree;

import java.util.*;
import java.util.stream.Collectors;

public class SecondTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> items = Arrays.stream(sc.nextLine().split("\\s+"))
                .collect(Collectors.toList());
        String input = sc.nextLine();
        while (!input.equals("end")) {
            String command = input.split("\\s+")[0];

            switch (command) {
                case "reverse":
                    int startIndex = Integer.parseInt(input.split("\\s+")[2]);
                    int count = Integer.parseInt(input.split("\\s+")[4]);
                    List<String> reversedElements = new ArrayList<>();
                    for (int i = startIndex; i < startIndex + count; i++) {
                        reversedElements.add(0, items.remove(startIndex));
                    }
                    for (int i = 0; i < count; i++) {
                        items.add(startIndex + i, reversedElements.get(i));
                    }
                    break;
                case "sort":
                    int startIndexForSort = Integer.parseInt(input.split("\\s+")[2]);
                    int countForSort = Integer.parseInt(input.split("\\s+")[4]);
                    List<String> sortedElements = new ArrayList<>();
                    for (int i = startIndexForSort; i < startIndexForSort + countForSort; i++) {
                        sortedElements.add(items.remove(startIndexForSort));
                    }
                    Collections.sort(sortedElements);
                    for (int i = 0; i < countForSort; i++) {
                        items.add(startIndexForSort + i, sortedElements.get(i));
                    }
                    break;
                case "remove":
                    int contForRemoving = Integer.parseInt(input.split("\\s+")[1]);
                    for (int i = 0; i < contForRemoving; i++) {
                        items.remove(0);
                    }
                    break;
            }
            input = sc.nextLine();
        }
        String output = String.join(", ", items);
        System.out.print(output);
    }
}
