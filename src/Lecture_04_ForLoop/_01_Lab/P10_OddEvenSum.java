package Lecture_04_ForLoop._01_Lab;

import java.util.Scanner;

public class P10_OddEvenSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int sumEven = 0;
        int sumOdd = 0;

        for (int i = 1; i <= n; i ++) {
            int number = Integer.parseInt(scanner.nextLine());
            if (i % 2 != 0) {
                sumOdd += number;
            } else {
                sumEven += number;
            }
        }
        if (sumEven == sumOdd) {
            System.out.println("Yes");
            System.out.println("Sum = " + sumOdd);
        } else {
            System.out.println("No");
            System.out.println("Diff = " + Math.abs(sumOdd - sumEven));
        }
    }
}
