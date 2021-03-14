package Lists.MoreExercise;

import java.util.*;
import java.util.stream.Collectors;

public class MixedUpLists_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> firstList = Arrays.stream(sc.nextLine().split("\\s+"))
                .map(e -> Integer.parseInt(e)).collect(Collectors.toList());
        List<Integer> secondList = Arrays.stream(sc.nextLine().split("\\s+"))
                .map(e -> Integer.parseInt(e)).collect(Collectors.toList());
        List<Integer> midList = new ArrayList<>();
        Collections.reverse(secondList);
        int maxIndex = 0;
        boolean isFirst = true;
        if (firstList.size() >= secondList.size()) {
            maxIndex = secondList.size();
        } else {
            maxIndex = firstList.size();
            isFirst = false;
        }
        for (int i = 0; i < maxIndex; i++) {
            midList.add(firstList.get(i));
            midList.add(secondList.get(i));
        }
        int count = 0;
        for (int i = 0; i < maxIndex - count; i++) {
            firstList.remove(i);
            secondList.remove(i);
            count++;
            i--;

        }
        int minRange = 0;
        int maxRange = 0;
        if (isFirst) {
            Collections.sort(firstList);
            minRange = firstList.get(0);
            maxRange = firstList.get(1);
        } else {
            Collections.sort(secondList);
            minRange = secondList.get(0);
            maxRange = secondList.get(1);
        }
        Collections.sort(midList);
        for (Integer number : midList) {
            if (number > minRange && number < maxRange) {
                System.out.print(number + " ");
            }
        }
    }
}
