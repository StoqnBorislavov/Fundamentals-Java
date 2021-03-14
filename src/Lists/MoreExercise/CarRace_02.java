package Lists.MoreExercise;

import java.util.*;
import java.util.stream.Collectors;

public class CarRace_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(sc.nextLine()
                .split("\\s+")).map(e -> Integer.parseInt(e))
                .collect(Collectors.toList());
        List<Integer> racerOneTimes = new ArrayList<>();
        for (int i = 0; i < numbers.size()/2; i++) {
            racerOneTimes.add(numbers.get(i));
        }
        Collections.reverse(numbers);
        List<Integer> racerTwoTimes = new ArrayList<>();
        for (int i = 0; i < numbers.size()/2; i++) {
            racerTwoTimes.add(numbers.get(i));
        }
        double timeOnLeftRacer = 0;
        for (int i = 0; i < racerOneTimes.size(); i++) {
            if(racerOneTimes.get(i) == 0){
                timeOnLeftRacer *= 0.8;
            } else{
                timeOnLeftRacer += racerOneTimes.get(i);
            }
        }
        double timeOnRightRacer = 0;
        for (int i = 0; i < racerTwoTimes.size(); i++) {
            if(racerTwoTimes.get(i) == 0){
                timeOnRightRacer *= 0.8;
            } else{
                timeOnRightRacer += racerTwoTimes.get(i);
            }
        }
        if(timeOnLeftRacer < timeOnRightRacer){
            System.out.printf("The winner is left with total time: %.1f", timeOnLeftRacer);
        } else {
            System.out.printf("The winner is right with total time: %.1f", timeOnRightRacer);
        }

    }
}
