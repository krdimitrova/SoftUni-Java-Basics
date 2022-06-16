package Lecture_05_WhileLoop._01_Lab;

import java.util.Scanner;

public class P8_Graduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int n = 0;
        double totalGrades = 0.00;
        boolean theyFailed = false;

        while (n != 12) {
            double grade = Double.parseDouble(scanner.nextLine());
            totalGrades += grade;
            n++;

            if (grade < 4.00) {
                theyFailed = true;
                break;
            }

        }

        if (theyFailed) {
            System.out.printf("%s has been excluded at %d grade", name, n);
        } else {
            System.out.printf("%s graduated. Average grade: %.2f", name, totalGrades / 12);
        }
    }
}
