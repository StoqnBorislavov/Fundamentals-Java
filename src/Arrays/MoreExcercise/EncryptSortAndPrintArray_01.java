package Arrays.MoreExcercise;

import java.util.Scanner;

public class EncryptSortAndPrintArray_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfStrings = Integer.parseInt(sc.nextLine());
        int[] encryptedNames = new int[numberOfStrings];
        for (int i = 0; i < numberOfStrings; i++) {
            int sum = 0;
            String name = sc.nextLine();
            for (int j = 0; j < name.length(); j++) {
                char c = name.charAt(j);
                if (c == 65 || c == 69 || c == 73 || c == 79 || c == 85
                        || c == 97 || c == 101 || c == 105 || c == 111 || c == 117) {
                    sum += c * name.length();
                } else {
                    sum += c / name.length();
                }
            }
            encryptedNames[i] = sum;
        }
        for (int i = 0; i < encryptedNames.length - 1; i++) {
            for (int j = 0; j < encryptedNames.length - i - 1; j++) {
                if (encryptedNames[j] > encryptedNames[j + 1]) {
                    int temp = encryptedNames[j];
                    encryptedNames[j] = encryptedNames[j + 1];
                    encryptedNames[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < encryptedNames.length; i++) {
            System.out.println(encryptedNames[i]);

        }
    }
}


