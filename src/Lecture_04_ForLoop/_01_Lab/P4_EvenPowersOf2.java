package Lecture_04_ForLoop._01_Lab;

import java.util.Scanner;

public class P4_EvenPowersOf2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        for (int step = 0; step <= number ; step += 2) {
            System.out.printf("%.0f%n", Math.pow(2, step));
        }
    }
}
