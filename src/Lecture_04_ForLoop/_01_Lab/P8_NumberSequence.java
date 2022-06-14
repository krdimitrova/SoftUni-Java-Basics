package Lecture_04_ForLoop._01_Lab;

import java.util.Scanner;

public class P8_NumberSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countNumber = Integer.parseInt(scanner.nextLine());
        int max = Integer.MIN_VALUE;
        int min =  Integer.MAX_VALUE;

        for (int number = 1; number <= countNumber; number ++) {
            int value = Integer.parseInt(scanner.nextLine());
            if (value > max) {
                max = value;
            }
            if (value < min) {
                min = value;
            }
        }
        System.out.printf("Max number: %d%nMin number: %d", max, min);
    }
}
