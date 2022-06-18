package Lecture_06_NestedLoops._01_Lab;

import java.util.Scanner;

public class P5_Travelling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String destination = scanner.nextLine();

        while (!destination.equals("End")) {
            double money = Double.parseDouble(scanner.nextLine());
            double savings = 0;
            while (savings < money) {
                double moreSavings = Double.parseDouble(scanner.nextLine());
                savings = savings + moreSavings;
            }
            System.out.printf("Going to %s!%n", destination);
            destination = scanner.nextLine();
        }
    }
}
