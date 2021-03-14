package AssociativeArrays.Lab;

import java.util.*;

public class OddOccurrences_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] words = sc.nextLine().split("\\s+");

        Map<String, Integer> occurrenceCount = new LinkedHashMap<>();

        for (String word : words) {
            word = word.toLowerCase();
            if (occurrenceCount.containsKey(word)) {
                int currentWordCount = occurrenceCount.get(word);
                occurrenceCount.put(word, currentWordCount + 1);
            } else {
                occurrenceCount.put(word, 1);
            }
        }
        List<String> listToPrint = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : occurrenceCount.entrySet()) {
            if (occurrenceCount.get(entry.getKey()) % 2 != 0) {
                listToPrint.add(entry.getKey());
            }
        }
        String output = String.join(", ", listToPrint);
        System.out.println(output);
//        for (int i = 0; i < listToPrint.size(); i++) {
//            if(i == listToPrint.size() - 1){
//                System.out.print(listToPrint.get(i));
//            } else {
//                System.out.print(listToPrint.get(i) + ", ");
//            }
//
//        }

    }
}
