package Lecture_04_ForLoop._01_Lab;

import java.util.Scanner;

public class P3_Numbers1ToNWithStep3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int number = 1; number <= n; number += 3) {
            System.out.println(number);
        }
    }
}
