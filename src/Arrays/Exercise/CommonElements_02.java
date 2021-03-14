package Arrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class CommonElements_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] words1 = sc.nextLine().split(" ");
        String[] words2 = sc.nextLine().split(" ");
        for (int i = 0; i < words2.length; i++) {
            String word2 = words2[i];
            for (int j = 0; j <= words2.length; j++) {
                String word1 = words1[j];
                if(word2.equals(word1)){
                    System.out.print(word1 + " ");
                }
            }
        }
    }
}


