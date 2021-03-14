package AssociativeArrays.MoreExercise;

import java.util.*;
import java.util.concurrent.Phaser;

public class Judge_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        Map<String, List<Map<String, Integer>>> playersMap = new LinkedHashMap<>();
        Map<String, Integer> contestantMap = new HashMap<>();
        while (!input.equals("no more time")) {
            String[] command = input.split(" -> ");
            String player = command[0];
            String contest = command[1];
            int points = Integer.parseInt(command[2]);
            addContestant(player, contest, points, playersMap, contestantMap);

            input = sc.nextLine();
        }
//        playersMap.entrySet().stream()
//                .forEach(e ->{
//                    System.out.printf("%s: %d participants%n", e.getKey(), e.getKey().length());
//                    for (List<Map<String, Integer>> value : playersMap.values()) {
//                        for (int i = 0; i < value.size(); i++) {
//                            value.get(i).values().com
//                        }
//                    }
//                });

            //iterate over outer map
        for(Map.Entry<String, List<Map<String, Integer>>> topEntry : playersMap.entrySet()) {
            String topKey = topEntry.getKey();
            //iterate over list
            System.out.printf("%s: %d participants%n", topKey, topEntry.getValue().size());
            for(Map<String, Integer> innerMap : topEntry.getValue()) {
                //iterate over inner map
                int counter = 1;
                innerMap.entrySet().stream()
                        .sorted(Map.Entry.<String, Integer>comparingByValue().reversed()
                        .thenComparing(Map.Entry.comparingByKey()))
                        .forEach(e ->{
                            System.out.printf("%d. %s <::> %d%n", counter, e.getKey(), e.getValue());
                                });
            }
        }
    }

    private static void addContestant(String player, String contest, int points,
                                      Map<String, List<Map<String, Integer>>> playersMap,
                                      Map<String, Integer> contestantMap) {
        if (!playersMap.containsKey(contest)) {
            playersMap.put(contest, new ArrayList<>());
            Map<String, Integer> currentContestant = new HashMap<>();
            currentContestant.put(player, points);
            playersMap.get(contest).add(currentContestant);
            if(contestantMap.containsKey(player)) {
                contestantMap.put(player, contestantMap.get(player) + points);
            } else{
                contestantMap.put(player, points);
            }
        } else if (playersMap.containsKey(contest)) {
            playersMap.get(contest).stream()
                    .forEach(e -> {
                        if (e.containsKey(player)) {
                            if (e.get(player) <= points) {
                                e.put(player, points);
                            }
                        } else {
                            e.put(player, points);
                        }
                    });
            if(contestantMap.containsKey(player)) {
                contestantMap.put(player, contestantMap.get(player) + points);
            } else{
                contestantMap.put(player, points);
            }
        }
    }
}
