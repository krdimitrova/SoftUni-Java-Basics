package Lecture_02_ConditionalStatements._01_Lab;

import java.util.Scanner;

public class P3_EvenOrOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        if (number % 2 == 0 ) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
    }
}
