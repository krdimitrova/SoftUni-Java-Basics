package MoreExercises._05_ForLoop;

import java.util.Scanner;

public class P4_Grades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int students = Integer.parseInt(scanner.nextLine());

        int failed = 0;
        int between3And4 = 0;
        int between4And5 = 0;
        int plus5 = 0;
        double totalGrade = 0;

        for (int i = 1; i <= students; i++) {
            double grade = Double.parseDouble(scanner.nextLine());

            if (grade >= 5.00) {
                plus5++;
            } else if (grade >= 4.00) {
                between4And5++;
            } else if (grade >= 3.00) {
                between3And4++;
            } else if (grade < 3.00) {
                failed++;
            }

            totalGrade += grade;

        }

        System.out.printf("Top students: %.2f%%%n", plus5 * 100 / (students * 1.0));
        System.out.printf("Between 4.00 and 4.99: %.2f%%%n", between4And5 * 100 / (students * 1.0));
        System.out.printf("Between 3.00 and 3.99: %.2f%%%n", between3And4 * 100 / (students * 1.0));
        System.out.printf("Fail: %.2f%%%n", failed * 100 / (students * 1.0));
        System.out.printf("Average: %.2f", totalGrade / (students * 1.0));
    }
}
