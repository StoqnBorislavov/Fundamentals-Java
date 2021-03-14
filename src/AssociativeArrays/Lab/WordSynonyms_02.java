package AssociativeArrays.Lab;

import java.util.*;

public class WordSynonyms_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pairsCount = Integer.parseInt(sc.nextLine());

        Map<String, List<String>> synonyms = new LinkedHashMap<>();
        for (int i = 0; i < pairsCount; i++) {
            String key = sc.nextLine();
            String synonym = sc.nextLine();

            if (synonyms.containsKey(key)){
                List<String> stringList = synonyms.get(key);
                stringList.add(synonym);
                synonyms.put(key, stringList);

            } else {
                List<String> list = new ArrayList<>();
                list.add(synonym);
                synonyms.put(key, list);
            }


        }
        for (Map.Entry<String, List<String>> entry : synonyms.entrySet()) {
            System.out.printf("%s - %s%n", entry.getKey(), entry.getValue().
                    toString().
                    replaceAll("[\\[\\]]", ""));

        }
    }
}
