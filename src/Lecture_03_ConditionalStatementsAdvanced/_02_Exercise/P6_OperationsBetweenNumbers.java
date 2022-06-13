package Lecture_03_ConditionalStatementsAdvanced._02_Exercise;

import java.util.Scanner;

public class P6_OperationsBetweenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();

        int addition = n1 + n2;
        int subtraction = n1 - n2;
        int multiplication = n1 * n2;
        double division = n1 * 1.0 / n2;
        double remainder = n1 * 1.0 % n2;

        if (operator.equals("+")) {
            System.out.printf("%d + %d = %d - ", n1, n2, addition);
            if (addition % 2 == 0) {
                System.out.printf("even");
            } else {
                System.out.printf("odd");
            }
        } else if (operator.equals("-")){
            System.out.printf("%d - %d = %d - ", n1, n2, subtraction);
            if (subtraction % 2 == 0) {
                System.out.printf("even");
            } else {
                System.out.printf("odd");
            }
        } else if (operator.equals("*")) {
            System.out.printf("%d * %d = %d - ", n1, n2, multiplication);
            if (multiplication % 2 == 0) {
                System.out.printf("even");
            } else {
                System.out.printf("odd");
            }
        } else if (operator.equals("/")) {
            if (n2 == 0.0) {
                System.out.printf("Cannot divide %d by zero", n1);
            } else {
                System.out.printf("%d %s %d = %.2f", n1, operator, n2, division);
            }
        } else if (operator.equals("%")) {
            if (n2 == 0.0) {
                System.out.printf("Cannot divide %d by zero", n1);
            } else {
                System.out.printf("%d %s %d = %.0f", n1, operator, n2, remainder);
            }
        }

    }
}
