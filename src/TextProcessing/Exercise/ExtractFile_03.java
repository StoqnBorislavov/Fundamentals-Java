package TextProcessing.Exercise;

import java.util.Scanner;

public class ExtractFile_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
            String[] arr = input.split("\\\\");
        int lastIndexOfSlash = input.lastIndexOf("\\");
        int lastIndexOfDot = input.lastIndexOf(".");
        String fileName = input.substring(lastIndexOfSlash + 1, lastIndexOfDot);
        String extension = input.substring(lastIndexOfDot + 1);
        System.out.printf("File name: %s%nFile extension: %s%n", fileName, extension);
    }
}
