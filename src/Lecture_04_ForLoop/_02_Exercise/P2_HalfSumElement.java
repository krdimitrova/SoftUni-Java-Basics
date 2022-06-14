package Lecture_04_ForLoop._02_Exercise;

import java.util.Scanner;

public class P2_HalfSumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int maxNumber = Integer.MIN_VALUE;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            sum += number;
            if (number > maxNumber) {
                maxNumber = number;
            }
        }

        sum -= maxNumber;

        if (maxNumber == sum) {
            System.out.printf("Yes %n Sum = %d", maxNumber);
        } else {
            System.out.printf("No %n Diff = %d", Math.abs(maxNumber - sum));
        }
    }
}
