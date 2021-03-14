package Arrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class KaminoFactory_09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sequenceLength = Integer.parseInt(sc.nextLine());
        String dna = sc.nextLine();
        int indexOfCurrentArray = 0;
        int indexOfBestArray = 0;
        int maxSum = 0;
        int minIndexInAllArrays = 101;
        int maxOnesInAllArrays = 0;
        String[] bestDnaString = new String[sequenceLength];
        while (!dna.equals("Clone them!")) {
            int[] dnaInInt = Arrays.stream(dna.split("!+"))
                    .mapToInt(e -> Integer.parseInt(e)).toArray();
            indexOfCurrentArray++;
            int sum = 0;
            int maxOnesInCurrentArray = 0;
            int countOfOnes = 0;
            int minIndex = 101;
            for (int i = 0; i < dnaInInt.length; i++) {
                boolean isNull = false;
                int number = dnaInInt[i];
                sum += number;
                if (number == 1) {
                    countOfOnes++;
                    if(i == dnaInInt.length - 1){
                        if(maxOnesInCurrentArray < countOfOnes){
                            maxOnesInCurrentArray = countOfOnes;
                            minIndex = i - countOfOnes;
                        }
                    }
                } else if (number == 0) {
                    if (maxOnesInCurrentArray < countOfOnes) {
                        maxOnesInCurrentArray = countOfOnes;
                        minIndex = i - maxOnesInCurrentArray;
                    }
                    if(maxOnesInCurrentArray == 0 && i == dnaInInt.length - 1){
                        indexOfBestArray++;
                        isNull = true;
                        if(isNull){
                            indexOfBestArray = 1;
                        bestDnaString = dna.split("!+");
                        }


                    }
                    countOfOnes = 0;
                }
            }
            // Проверка дали масива който е обходен в момнета е по добър от предходния масив.
            // Първа проверка: дали последователните единици в сегашния масив са повече от тези в предходния;
            if (maxOnesInCurrentArray > maxOnesInAllArrays) {
                indexOfBestArray = indexOfCurrentArray;
                maxSum = sum;
                maxOnesInAllArrays = maxOnesInCurrentArray;
                minIndexInAllArrays = minIndex;
                bestDnaString = dna.split("!+");
             // Втора проверка ако последователните единиците в сегашния и тези в предходния са еднакви;
            } else if (maxOnesInCurrentArray == maxOnesInAllArrays) {
                // Проверяваме дали последоветелните единици в сегашния масив започват
                // по - наляво от тези в предходния;
                if (minIndex < minIndexInAllArrays) {
                    indexOfBestArray = indexOfCurrentArray;
                    maxSum = sum;
                    minIndexInAllArrays = minIndex;
                    bestDnaString = dna.split("!+");
                } else if (minIndex == minIndexInAllArrays) {
                    // Ако и индексите започват на едно и също място, правим проверка
                    // за максималната сума на елементите от масива;
                    if (sum > maxSum) {
                        indexOfBestArray = indexOfCurrentArray;
                        maxSum = sum;
                        bestDnaString = dna.split("!+");
                    }
                }
            }
            dna = sc.nextLine();
        }
        System.out.printf("Best DNA sample %d with sum: %d.%n", indexOfBestArray, maxSum);
        System.out.println(String.join(" ", bestDnaString));
    }
}
