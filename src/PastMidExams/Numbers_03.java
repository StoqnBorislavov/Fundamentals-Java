package PastMidExams;

import java.util.*;
import java.util.stream.Collectors;

public class Numbers_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> initialArray = Arrays.stream(sc.nextLine().split("\\s+"))
                .map(e -> Integer.parseInt(e)).collect(Collectors.toList());
        int sumOfElements = 0;
        for (Integer integer : initialArray) {
            sumOfElements += integer;
        }
        double averageNumber = sumOfElements * 1.0 / initialArray.size();
        List<Integer> newArrayList = new ArrayList<>();
        boolean isExist = false;
        for (Integer number : initialArray) {
            if (number > averageNumber) {
                newArrayList.add(number);
                isExist = true;
            }
        }
        Collections.sort(newArrayList);
        Collections.reverse(newArrayList);
        if (isExist) {
            if (newArrayList.size() > 5) {
                for (int i = 0; i < 5; i++) {
                    System.out.print(newArrayList.get(i) + " ");
                }
            } else {
                for (int i = 0; i < newArrayList.size(); i++) {
                    System.out.print(newArrayList.get(i) + " ");
                }
            }
        } else {
            System.out.println("No");
        }
    }
}
