package Methods.Excercise;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayManipulator_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = Arrays.stream(sc.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e)).toArray();
        String command = sc.nextLine();
        while (!command.equals("end")) {
            String[] com = command.split(" ");
            switch (com[0]) {
                case "exchange":
                    int index = Integer.parseInt(com[1]);
                    if (index < 0 || index >= numbers.length) {
                        System.out.println("Invalid index");
                    } else {
                        numbers = exchangeArray(numbers, index);
                    }
                    break;
                case "max":
                    if (com[1].equals("even")) {
                        findMaxEvenElement(numbers);
                        break;
                    } else if (com[1].equals("odd")) {
                        findMaxOddElement(numbers);
                        break;
                    }
                case "min":
                    if (com[1].equals("even")) {
                        findMinEvenElement(numbers);
                        break;
                    } else if (com[1].equals("odd")) {
                        findMinOddElement(numbers);
                        break;
                    }
                case "first":
                    int countOfFirst = Integer.parseInt(com[1]);
                    if (com[2].equals("even")) {
                        printCountOfFirstEvenElements(numbers, countOfFirst);
                    } else if (com[2].equals("odd")) {
                        printCountOfFirstOddElements(numbers, countOfFirst);
                    }
                    break;
                case "last":
                    int countOfLast = Integer.parseInt(com[1]);
                    if (com[2].equals("even")) {
                        printCountOfLastEvenElements(numbers, countOfLast);
                    } else if (com[2].equals("odd")) {
                        printCountOfLastOddElements(numbers, countOfLast);
                    }
                    break;
            }
            command = sc.nextLine();
        }
        System.out.print("[");
        for (int i = 0; i < numbers.length; i++) {
            if (i < numbers.length - 1) {
                System.out.print(numbers[i] + ", ");
            } else {
                System.out.print(numbers[i]);
            }
        }
        System.out.print("]");
    }

    private static void printCountOfLastOddElements(int[] numbers, int countOfLast) {
        if (countOfLast > numbers.length) {
            System.out.println("Invalid count");
        } else {
            int[] newArr = new int[numbers.length];
            int maxIndex = -1;
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] % 2 == 1) {
                    for (int j = 0; j < newArr.length; j++) {
                        if (newArr[j] == 0) {
                            newArr[j] = numbers[i];
                            maxIndex = j;
                            break;
                        }
                    }
                }
            }
            if (countOfLast > maxIndex) {
                System.out.print("[");
                for (int i = 0; i <= maxIndex; i++) {
                    if (i == 0) {
                        System.out.print(newArr[i]);
                    } else {
                        System.out.print(", " + newArr[i]);
                    }
                }
                System.out.println("]");
            } else {
                System.out.print("[");
                for (int i = (maxIndex + 1) - countOfLast; i <= maxIndex; i++) {
                    if (i == maxIndex + 1 - countOfLast) {
                        System.out.print(newArr[i]);
                    } else {
                        System.out.print(", " + newArr[i]);
                    }
                }
                System.out.println("]");
            }
        }
    }

    private static void printFinalStateOfArray(int[] numbers) {
        System.out.print("[");
        for (int i = 0; i < numbers.length; i++) {
            if (i < numbers.length - 1) {
                System.out.print(numbers[i] + ", ");
            } else {
                System.out.print(numbers[i]);
            }
        }
        System.out.println("]");
    }

    private static void printCountOfLastEvenElements(int[] numbers, int countOfLast) {
        if (countOfLast > numbers.length) {
            System.out.println("Invalid count");
        } else {
            int[] newArr = new int[numbers.length];
            int maxIndex = -1;
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] % 2 == 0) {
                    for (int j = 0; j < newArr.length; j++) {
                        if (newArr[j] == 0) {
                            newArr[j] = numbers[i];
                            maxIndex = j;
                            break;
                        }
                    }
                }
            }
            if (countOfLast > maxIndex) {
                System.out.print("[");
                for (int i = 0; i <= maxIndex; i++) {
                    if (i == 0) {
                        System.out.print(newArr[i]);
                    } else {
                        System.out.print(", " + newArr[i]);
                    }
                }
                System.out.println("]");
            } else {
                System.out.print("[");
                for (int i = maxIndex - countOfLast; i < maxIndex; i++) {
                    if (i == 0) {
                        System.out.print(newArr[i]);
                    } else {
                        System.out.print(", " + newArr[i]);
                    }
                }
                System.out.println("]");
            }
        }
    }

    private static void printCountOfFirstOddElements(int[] numbers, int count) {
        if (count > numbers.length) {
            System.out.println("Invalid count");
        } else {
            int[] newArr = new int[numbers.length];
            int maxIndex = 0;
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] % 2 == 1) {
                    for (int j = 0; j < newArr.length; j++) {
                        if (newArr[j] == 0) {
                            newArr[j] = numbers[i];
                            maxIndex++;
                            break;
                        }
                    }
                }
            }
            if (count > maxIndex) {
                System.out.print("[");
                for (int i = 0; i < maxIndex; i++) {
                    if (i == 0) {
                        System.out.print(newArr[i]);
                    } else {
                        System.out.print(", " + newArr[i]);
                    }
                }
                System.out.println("]");
            } else {
                System.out.print("[");
                for (int i = 0; i < count; i++) {
                    if (i == 0) {
                        System.out.print(newArr[i]);
                    } else {
                        System.out.print(", " + newArr[i]);
                    }
                }
                System.out.println("]");
            }
        }
    }

    private static void printCountOfFirstEvenElements(int[] numbers, int count) {
        if (count > numbers.length) {
            System.out.println("Invalid count");
        } else {
            int[] newArr = new int[numbers.length];
            int maxIndex = 0;
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] % 2 == 0) {
                    for (int j = 0; j < newArr.length; j++) {
                        if (newArr[j] == 0) {
                            newArr[j] = numbers[i];
                            maxIndex++;
                            break;
                        }
                    }
                }
            }
            if (count > maxIndex) {
                System.out.print("[");
                for (int i = 0; i < maxIndex; i++) {
                    if (i == 0) {
                        System.out.print(newArr[i]);
                    } else {
                        System.out.print(", " + newArr[i]);
                    }
                }
                System.out.println("]");
            } else {
                System.out.print("[");
                for (int i = 0; i < count; i++) {
                    if (i == 0) {
                        System.out.print(newArr[i]);
                    } else {
                        System.out.print(", " + newArr[i]);
                    }
                }
                System.out.println("]");
            }
        }
    }

    private static void findMinOddElement(int[] numbers) {
        boolean isFound = false;
        int minOddElement = Integer.MAX_VALUE;
        int indexOfMinOdd = numbers.length;
        for (int i = 0; i < numbers.length; i++) {
            int currentElement = numbers[i];
            if (currentElement % 2 == 1) {
                if (currentElement <= minOddElement) {
                    minOddElement = currentElement;
                    indexOfMinOdd = i;
                }
                isFound = true;
            }
        }
        if (isFound) {
            System.out.println(indexOfMinOdd);
        } else {
            System.out.println("No matches");
        }
    }

    private static void findMinEvenElement(int[] numbers) {
        boolean isFound = false;
        int minEvenElement = Integer.MAX_VALUE;
        int indexOfMinEven = numbers.length;
        ;
        for (int i = 0; i < numbers.length; i++) {
            int currentElement = numbers[i];
            if (currentElement % 2 == 0) {
                if (currentElement <= minEvenElement) {
                    minEvenElement = currentElement;
                    indexOfMinEven = i;
                }
                isFound = true;
            }
        }
        if (isFound) {
            System.out.println(indexOfMinEven);
        } else {
            System.out.println("No matches");
        }
    }

    private static void findMaxOddElement(int[] numbers) {
        boolean isFound = false;
        int maxOddElement = Integer.MIN_VALUE;
        int indexOfMaxOdd = -1;
        for (int i = 0; i < numbers.length; i++) {
            int currentElement = numbers[i];
            if (currentElement % 2 == 1) {
                if (currentElement >= maxOddElement) {
                    maxOddElement = currentElement;
                    indexOfMaxOdd = i;
                }
                isFound = true;
            }
        }
        if (isFound) {
            System.out.println(indexOfMaxOdd);
        } else {
            System.out.println("No matches");
        }
    }

    private static void findMaxEvenElement(int[] numbers) {
        boolean isFound = false;
        int maxEvenElement = Integer.MIN_VALUE;
        int indexOfMaxEven = -1;
        for (int i = 0; i < numbers.length; i++) {
            int currentElement = numbers[i];
            if (currentElement % 2 == 0) {
                if (currentElement >= maxEvenElement) {
                    maxEvenElement = currentElement;
                    indexOfMaxEven = i;
                }
                isFound = true;
            }
        }
        if (isFound) {
            System.out.println(indexOfMaxEven);
        } else {
            System.out.println("No matches");
        }
    }

    private static int[] exchangeArray(int[] numbers, int index) {
        int[] newNumber = new int[numbers.length];
        int indexForNewArray = 0;
        for (int i = index + 1; i < numbers.length; i++) {
            newNumber[indexForNewArray++] = numbers[i];
        }
        for (int i = 0; i <= index; i++) {
            newNumber[indexForNewArray++] = numbers[i];
        }
        return newNumber;
    }
}
