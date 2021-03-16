package AssociativeArrays.MoreExercise;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class MOBAChallenger_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        Map<String, Map<String, Integer>> playersMap = new HashMap<>();
        Map<String, Integer> contestantMap = new HashMap<>();
        while (!input.equals("Season end")) {
            String regexForSplit = "";
            if (input.contains("->")) {
                regexForSplit = " -> ";
            } else {
                regexForSplit = " vs ";
            }
            String[] command = input.split(regexForSplit);
            if (command.length == 2) {
                String firstPlayer = command[0];
                String secondPlayer = command[1];
                if (playersMap.containsKey(firstPlayer) && playersMap.containsKey(secondPlayer)) {
                    battleThem(firstPlayer, secondPlayer, playersMap, contestantMap);
                }
            } else if (command.length == 3) {
                String player = command[0];
                String position = command[1];
                int skills = Integer.parseInt(command[2]);
                addPlayer(player, position, skills, playersMap, contestantMap);
            }
            input = sc.nextLine();
        }
        contestantMap.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed()
                        .thenComparing(Map.Entry.comparingByKey()))
                .forEach(e -> {
                    System.out.printf("%s: %d skill%n", e.getKey(), e.getValue());
                    playersMap.get(e.getKey()).entrySet().stream()
                            .sorted(Map.Entry.<String, Integer>comparingByValue().reversed()
                                    .thenComparing(Map.Entry.comparingByKey()))
                            .forEach(b -> System.out.printf("- %s <::> %d%n", b.getKey(), b.getValue()));

                });
    }

    private static void battleThem(String firstPlayer, String secondPlayer, Map<String,
            Map<String, Integer>> playersMap, Map<String, Integer> contestantMap) {
        int firstPlayerPoints = 0;
        int secondPlayerPoints = 0;
        for (String key : playersMap.get(firstPlayer).keySet()) {
            if (playersMap.get(firstPlayer).containsKey(key) && playersMap.get(secondPlayer).containsKey(key)) {
                firstPlayerPoints += playersMap.get(firstPlayer).get(key);
                secondPlayerPoints += playersMap.get(secondPlayer).get(key);
            }
        }
        if (firstPlayerPoints > secondPlayerPoints) {
            playersMap.remove(secondPlayer);
            contestantMap.remove(secondPlayer);
        } else if (firstPlayerPoints < secondPlayerPoints) {
            playersMap.remove(firstPlayer);
            contestantMap.remove(firstPlayer);
        }
    }

    private static void addPlayer(String player, String position, int skills,
                                  Map<String, Map<String, Integer>> playersMap,
                                  Map<String, Integer> contestantMap) {
        if (!contestantMap.containsKey(player)) {
            contestantMap.put(player, skills);
        } else if (!playersMap.containsKey(player) || !playersMap.get(player).containsKey(position)) {
            contestantMap.put(player, contestantMap.get(player) + skills);
        } else if (contestantMap.get(player) < skills) {
            contestantMap.put(player, skills);
        }
        if (!playersMap.containsKey(player)) {
            playersMap.put(player, new HashMap<>());
            playersMap.get(player).put(position, skills);
        } else if (playersMap.containsKey(player) && !playersMap.get(player).containsKey(position)) {
            playersMap.get(player).put(position, skills);
        } else if (playersMap.get(player).containsKey(position) && playersMap.get(player).get(position) < skills) {
            playersMap.get(player).put(position, skills);
        }
    }
}
