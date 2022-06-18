package Lecture_06_NestedLoops._01_Lab;

import java.util.Scanner;

public class P4_SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startNumber = Integer.parseInt(scanner.nextLine());
        int lastNumber = Integer.parseInt(scanner.nextLine());
        int magicNumber = Integer.parseInt(scanner.nextLine());

        boolean isFound = false;
        int countCombinations = 0;

        for (int firstNumber = startNumber; firstNumber <= lastNumber; firstNumber++) {
            for (int secondNumber = startNumber; secondNumber <= lastNumber; secondNumber++) {
                countCombinations++;
                int sum = firstNumber + secondNumber;
                if (sum == magicNumber) {
                    isFound = true;
                    System.out.printf("Combination N:%d (%d + %d = %d)", countCombinations, firstNumber, secondNumber, magicNumber);
                    break;
                }
            }
            if (isFound) {
                break;
            }
        }

        if (!isFound) {
            System.out.printf("%d combinations - neither equals %d", countCombinations, magicNumber);
        }

    }
}
