package Lecture_05_WhileLoop._02_Exercise;

import java.util.Scanner;

public class P2_ExamPreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int badGradesLimit = Integer.parseInt(scanner.nextLine());
        String problem = scanner.nextLine();
        int poorGradesCount = 0;
        double gradesSum = 0;
        int gradesCount = 0;
        boolean isFailed = false;
        String lastProblem = "";

        while (!problem.equals("Enough")) {
            int grade = Integer.parseInt(scanner.nextLine());
            gradesSum += grade;
            gradesCount++;
            lastProblem = problem;

            if (grade <= 4) {
                poorGradesCount++;
                if (poorGradesCount == badGradesLimit) {
                    isFailed = true;
                    break;
                }
            }
            problem = scanner.nextLine();
        }

        if (isFailed) {
            System.out.printf("You need a break, %d poor grades.", poorGradesCount);
        } else {
            System.out.printf("Average score: %.2f%n" +
                    "Number of problems: %d%n" +
                    "Last problem: %s", gradesSum / gradesCount, gradesCount, lastProblem);
        }
    }
}
