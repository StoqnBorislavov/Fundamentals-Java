package AssociativeArrays.Lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Largest3Numbers_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(sc.nextLine().split(" "))
        .map(n-> Integer.parseInt(n))
        .sorted((l,r)-> r.compareTo(l))
        .limit(3)
        .collect(Collectors.toList());

        for (Integer number : numbers) {
            System.out.print(number + " ");
        }

    }
}
