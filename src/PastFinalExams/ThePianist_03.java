package PastFinalExams;

import java.util.*;

public class ThePianist_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        Map<String, List<String>> pianists = new TreeMap<>();
        for (int i = 0; i < n; i++) {
//            {piece}|{composer}|{key}
            String[] pieces = sc.nextLine().split("\\|");
            String piece = pieces[0];
            String composer = pieces[1];
            String key = pieces[2];
            pianists.put(piece, Arrays.asList(composer, key));

        }
        String command = sc.nextLine();
        while (!command.equals("Stop")) {
            String[] commandList = command.split("\\|");
            String commandName = commandList[0];
            String piece = commandList[1];
            switch (commandName) {
                case "Add":
//                    •	Add|{piece}|{composer}|{key}
//o	You need to add the given piece with the information about it to the other pieces
//o	If the piece is already in the collection, print:
//"{piece} is already in the collection!"
//o	If the piece is not in the collection, print:
//"{piece} by {composer} in {key} added to the collection!"
                    String composer = commandList[2];
                    String key = commandList[3];
                    if (pianists.containsKey(piece)) {
                        System.out.printf("%s is already in the collection!%n", piece);
                    } else {
                        pianists.put(piece, Arrays.asList(composer, key));
                        System.out.printf("%s by %s in %s added to the collection!%n", piece, composer, key);
                    }
                    break;
                case "Remove":
//                    •	Remove|{piece}
//o	If the piece is in the collection, remove it and print:
//"Successfully removed {piece}!"
//o	If the piece is not in the collection, print:
//"Invalid operation! {piece} does not exist in the collection."
                    if (pianists.containsKey(piece)) {
                        pianists.remove(piece);
                        System.out.printf("Successfully removed %s!%n", piece);
                    } else {
                        System.out.printf("Invalid operation! %s does not exist in the collection.%n", piece);
                    }
                    break;
                case "ChangeKey":
//•	ChangeKey|{piece}|{new key}
//o	If the piece is in the collection, change its key with the given one and print:
//"Changed the key of {piece} to {new key}!"
//o	If the piece is not in the collection, print:
//"Invalid operation! {piece} does not exist in the collection."
                    String newKey = commandList[2];
                    if (pianists.containsKey(piece)) {
                        pianists.get(piece).set(1, newKey);
                        System.out.printf("Changed the key of %s to %s!%n", piece, newKey);
                    } else {
                        System.out.printf("Invalid operation! %s does not exist in the collection.%n", piece);
                    }
                    break;

            }
            command = sc.nextLine();
        }
        pianists.entrySet().stream()
                .sorted((left, right) -> {
                    int result = left.getKey().compareTo(right.getKey());
                    if (result == 0) {
                        result = left.getValue().get(0).compareTo(right.getValue().get(0));
                    }
                    return result;
                })
                .forEach(e -> System.out.printf("%s -> Composer: %s, Key: %s%n",
                        e.getKey(), e.getValue().get(0), e.getValue().get(1)));
    }
}
