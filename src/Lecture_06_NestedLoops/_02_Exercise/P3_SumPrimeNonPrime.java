package Lecture_06_NestedLoops._02_Exercise;

import java.util.Scanner;

public class P3_SumPrimeNonPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int primeSum = 0;
        int nonPrimeSum = 0;

        while (!input.equals("stop")) {
            int number = Integer.parseInt(input);
            boolean isNonPrime = false;

            if (number < 0) {
                System.out.printf("Number is negative.%n");
                input = scanner.nextLine();
                continue;
            }


            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    isNonPrime = true;
                    break;
                }
            }

            if (isNonPrime) {
                nonPrimeSum += number;
            } else {
                primeSum += number;
            }
            input = scanner.nextLine();
        }
        System.out.printf("Sum of all prime numbers is: %d%n" + "Sum of all non prime numbers is: %d", primeSum, nonPrimeSum);
    }
}
