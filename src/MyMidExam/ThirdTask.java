package MyMidExam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ThirdTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> household = Arrays.stream(sc.nextLine().split("\\s+"))
                .map(e -> Integer.parseInt(e)).collect(Collectors.toList());
        int entryPoint = Integer.parseInt(sc.nextLine());
        String type = sc.nextLine();
        switch (type) {
            case "cheap":
                int leftDamage = findDamage(household, entryPoint, 0, entryPoint, "cheap");
                int rightDamage = findDamage(household, entryPoint, entryPoint, household.size(), "cheap");
                findBiggerDamage(leftDamage, rightDamage);
                break;
            case "expensive":
                int leftDamageForExpensive = findDamage(household, entryPoint, 0, entryPoint, "expensive");
                int rightDamageForExpensive = findDamage(household, entryPoint, entryPoint, household.size(), "expensive");
                findBiggerDamage(leftDamageForExpensive, rightDamageForExpensive);

                break;
        }
    }

    private static void findBiggerDamage(int firstDamage, int secondDamage) {
        if (firstDamage >= secondDamage) {
            System.out.printf("Left - %d", firstDamage);
        } else {
            System.out.printf("Right - %d", secondDamage);
        }
    }

    private static int findDamage(List<Integer> list, int entryPoint, int startPoint, int endPoint, String typeOfElements) {
        int damage = 0;
        int entryElement = list.get(entryPoint);
        if(startPoint != 0){
            startPoint += 1;
        }
        if (typeOfElements.equals("cheap")) {
            for (int i = startPoint; i < endPoint; i++) {
                if (entryElement > list.get(i)) {
                    damage += list.get(i);
                }
            }
        } else {
            for (int i = startPoint; i < endPoint; i++) {
                if (entryElement <= list.get(i)) {
                    damage += list.get(i);
                }
            }
        }
        return damage;
    }
}
