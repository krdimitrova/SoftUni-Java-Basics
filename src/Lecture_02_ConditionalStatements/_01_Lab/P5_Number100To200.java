package Lecture_02_ConditionalStatements._01_Lab;

import java.util.Scanner;

public class P5_Number100To200 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double number = Double.parseDouble(scanner.nextLine());

        if (number < 100) {
            System.out.println("Less than 100");
        } else if ( number <= 200) {
            System.out.println("Between 100 and 200");
        } else {
            System.out.println("Greater than 200");
        }
    }
}
