package AssociativeArrays.MoreExercise;

import com.sun.source.tree.LiteralTree;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Ranking_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String firstInput = sc.nextLine();
        Map<String, String> passMap = new HashMap<>();
        // first read input with passwords
        while (!firstInput.equals("end of contests")) {
            String[] contests = firstInput.split(":");
            String contest = contests[0];
            String pass = contests[1];
            if (!passMap.containsKey(contest)) {
                passMap.put(contest, pass);
            }
            firstInput = sc.nextLine();
        }
        // second input with contestants
        String secondInput = sc.nextLine();
        Map<String, Map<String, Integer>> pointsMap = new HashMap<>();
        while (!secondInput.equals("end of submissions")) {
            String[] newContestant = secondInput.split("=>");
            // "{contest}=>{password}=>{username}=>{points}"
            String contest = newContestant[0];
            String passToCheck = newContestant[1];
            String username = newContestant[2];
            int points = Integer.parseInt(newContestant[3]);
            // check if contest exist and if password is correct
            if (passMap.containsKey(contest) && passMap.get(contest).equals(passToCheck)) {
                if (!pointsMap.containsKey(username)) {
                    pointsMap.put(username, new HashMap<>());
                    pointsMap.get(username).put(contest, points);
                } else if (pointsMap.containsKey(username) && !pointsMap.get(username).containsKey(contest)) {
                    pointsMap.get(username).put(contest, points);
                } else {
                    if (pointsMap.get(username).get(contest) < points) {
                        pointsMap.get(username).put(contest, points);
                    }
                }
            }
            secondInput = sc.nextLine();
        }
        Map<String, Integer> allPoints = new TreeMap<>();
        for (Map.Entry<String, Map<String, Integer>> entry : pointsMap.entrySet()) {
            int sumOfPoints = 0;
            for (Map.Entry<String, Integer> e : pointsMap.get(entry.getKey()).entrySet()) {
                sumOfPoints += e.getValue();
            }
            if (!allPoints.containsKey(entry.getKey())) {
                allPoints.put(entry.getKey(), sumOfPoints);
            } else {
                int currentPoints = allPoints.get(entry.getKey());
                allPoints.put(entry.getKey(), currentPoints + sumOfPoints);
            }
        }
        allPoints.entrySet().stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .limit(1)
                .forEach(e -> System.out.printf("Best candidate is %s with total %d points.%n", e.getKey(), e.getValue()));
        System.out.println("Ranking: ");
        pointsMap.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .forEach(e -> {
                            System.out.println(e.getKey());
                            e.getValue().entrySet().stream()
                                    .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                                    .forEach(a -> System.out.printf("#  %s -> %d%n", a.getKey(), a.getValue()));
                        }
                );

    }
}

