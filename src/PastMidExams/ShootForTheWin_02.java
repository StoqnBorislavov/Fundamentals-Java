package PastMidExams;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ShootForTheWin_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> targets = Arrays.stream(sc.nextLine().split("\\s+"))
                .map(e -> Integer.parseInt(e)).collect(Collectors.toList());

        String input = sc.nextLine();
        int shots = 0;
        while (!input.equals("End")) {
            int indexOfTarget = Integer.parseInt(input);
            if (indexOfTarget < targets.size()) {
                int target = targets.get(indexOfTarget);
                if (target != -1) {
                    int shotTarget = targets.get(indexOfTarget);
                    targets.set(indexOfTarget, -1);
                    shots++;
                    for (int i = 0; i < targets.size(); i++) {
                        if (targets.get(i) > shotTarget && targets.get(i) != -1) {
                            targets.set(i, targets.get(i) - shotTarget);
                        } else if (targets.get(i) <= shotTarget && targets.get(i) != -1) {
                            targets.set(i, targets.get(i) + shotTarget);
                        }
                    }
                }
            }
            input = sc.nextLine();
        }
        System.out.printf("Shot targets: %d -> ", shots);
        for (Integer target : targets) {
            System.out.print(target + " ");
        }
    }
}
