package Lists.Excercise;

import java.util.*;
import java.util.stream.Collectors;

public class AppendArrays_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> input = Arrays.stream(sc.nextLine().split("[|]")).collect(Collectors.toList());
        Collections.reverse(input);
        String output = "";
        for (int i = 0; i < input.size(); i++) {
            output = input.get(i).replaceAll("[\\[\\],]", "").trim();
            if(output.isEmpty()){
                continue;
            }
            output = output.replaceAll("\\s+", " ");
            System.out.print(output + " ");
        }
    }
}
