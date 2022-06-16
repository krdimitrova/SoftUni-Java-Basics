package Lecture_05_WhileLoop._01_Lab;

import java.util.Scanner;

public class P3_SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startNumber = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        while (sum < startNumber) {
            int number = Integer.parseInt(scanner.nextLine());
            sum += number;
        }
        System.out.println(sum);
    }
}
