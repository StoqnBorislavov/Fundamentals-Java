package Lists.MoreExercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TakeSkipRope_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        List<Integer> numberList = new ArrayList<>();
        String nonNumbersString = "";
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            if (currentChar == '0' || currentChar == '1' || currentChar == '2' ||
                    currentChar == '3' || currentChar == '4' || currentChar == '5' ||
                    currentChar == '6' || currentChar == '7' || currentChar == '8' ||
                    currentChar == '9') {
                int currentNumber = Integer.parseInt("" + currentChar);
                numberList.add(currentNumber);
            } else {
                nonNumbersString += currentChar;
            }

        }
        List<Integer> takeList = new ArrayList<>();
        for (int i = 0; i < numberList.size(); i += 2) {
            takeList.add(numberList.get(i));
        }
        List<Integer> skipList = new ArrayList<>();
        for (int i = 1; i < numberList.size(); i += 2) {
            skipList.add(numberList.get(i));
        }
        StringBuilder str = new StringBuilder(nonNumbersString);
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < takeList.size(); i++) {
            if(str.length() >= takeList.get(i) + skipList.get(i)) {
                int numberOfCharsToTake = takeList.get(i);
                int numberOfCharsToSkip = skipList.get(i);
                for (int j = 0; j < numberOfCharsToTake; j++) {
                    result.append(str.charAt(j));
                }
                int countToTake = 0;
                for (int j = 0; j < numberOfCharsToTake - countToTake; j++) {
                    str.deleteCharAt(j);
                    countToTake++;
                    j--;
                }
                int countForSkip = 0;
                for (int j = 0; j < numberOfCharsToSkip - countForSkip; j++) {
                    str.deleteCharAt(j);
                    countForSkip++;
                    j--;
                }
            } else {
                int numberOfCharsToTake = takeList.get(i);
                int numberOfCharsToSkip = skipList.get(i);
                for (int j = 0; j < str.length(); j++) {
                    result.append(str.charAt(j));
                }
                int countToTake = 0;
                for (int j = 0; j < str.length() - countToTake; j++) {
                    str.deleteCharAt(j);
                    countToTake++;
                    j--;
                }
                int countForSkip = 0;
                for (int j = 0; j < str.length() - countForSkip; j++) {
                    str.deleteCharAt(j);
                    countForSkip++;
                    j--;
                }
            }


        }
        System.out.printf(result.toString());
    }
}
