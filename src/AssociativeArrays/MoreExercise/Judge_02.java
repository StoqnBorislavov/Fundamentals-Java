package AssociativeArrays.MoreExercise;

import java.util.*;
import java.util.concurrent.Phaser;
import java.util.concurrent.atomic.AtomicInteger;

public class Judge_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        Map<String, Map<String, Integer>> playersMap = new LinkedHashMap<>();
        Map<String, Integer> contestantMap = new HashMap<>();
        while (!input.equals("no more time")) {
            String[] command = input.split(" \\-> ");
            String player = command[0];
            String contest = command[1];
            int points = Integer.parseInt(command[2]);
            addContestant(player, contest, points, playersMap, contestantMap);

            input = sc.nextLine();
        }
        //iterate over outer map
        for (Map.Entry<String, Map<String, Integer>> entry : playersMap.entrySet()) {
            String key = entry.getKey();
            //iterate over list
            System.out.printf("%s: %d participants%n", key, entry.getValue().size());
            AtomicInteger count = new AtomicInteger(0);
            entry.getValue().entrySet().stream()
//                    .sorted(Map.Entry.<String, Integer>comparingByValue().reversed()
//                            .thenComparing(Map.Entry.comparingByKey()))
                    .sorted((left, right) -> {
                        int result = right.getValue().compareTo(left.getValue());
                        if (result == 0) {
                            result = left.getKey().compareTo(right.getKey());
                        }
                        return result;
                    })
                    .forEach(e -> {
                        System.out.printf("%d. %s <::> %d%n", count.incrementAndGet(), e.getKey(), e.getValue());
                    });
        }
        System.out.println("Individual standings:");
        AtomicInteger count = new AtomicInteger(0);
        contestantMap.entrySet().stream()
//                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed()
//                        .thenComparing(Map.Entry.comparingByKey()))
                .sorted((left, right) -> {
                    int result = right.getValue().compareTo(left.getValue());
                    if (result == 0) {
                        result = left.getKey().compareTo(right.getKey());
                    }
                    return result;
                })
                .forEach(e -> System.out.printf
                        ("%d. %s -> %d%n", count.incrementAndGet(), e.getKey(), e.getValue()));

    }


    private static void addContestant(String player, String contest, int points,
                                      Map<String, Map<String, Integer>> playersMap,
                                      Map<String, Integer> contestantMap) {
        if (!contestantMap.containsKey(player)) {
            contestantMap.put(player, points);

        } else if (!playersMap.containsKey(contest) || !playersMap.get(contest).containsKey(player)) {
            contestantMap.put(player, contestantMap.get(player) + points);
        } else if (playersMap.get(contest).containsKey(player) && contestantMap.get(player) < points) {
            contestantMap.put(player, points);
        }
        if (!playersMap.containsKey(contest)) {
            playersMap.put(contest, new HashMap<>());
            playersMap.get(contest).put(player, points);
        } else if (playersMap.containsKey(contest) && !playersMap.get(contest).containsKey(player)) {
            playersMap.get(contest).put(player, points);
        } else if (playersMap.containsKey(contest) && playersMap.get(contest).containsKey(player)) {
            if (playersMap.get(contest).get(player) < points) {
                playersMap.get(contest).put(player, points);
            }
        }

    }
}
