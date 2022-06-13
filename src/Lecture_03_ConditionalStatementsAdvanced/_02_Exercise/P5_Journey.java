package Lecture_03_ConditionalStatementsAdvanced._02_Exercise;

import java.util.Scanner;

public class P5_Journey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        double budgetSpending = 0;
        String destination = "";
        String staying = "";

        if (budget <= 100) {
            destination = "Bulgaria";
            if (season.equals("summer")) {
                budgetSpending = budget * 0.30;
                staying = "Camp";
            } else if (season.equals("winter")) {
                budgetSpending = budget * 0.70;
                staying = "Hotel";
            }
        } else  if (budget <= 1000) {
            destination = "Balkans";
            if (season.equals("summer")) {
                budgetSpending = budget * 0.40;
                staying = "Camp";
            } else if (season.equals("winter")) {
                budgetSpending = budget * 0.80;
                staying = "Hotel";
            }
        } else if (budget > 1000) {
            budgetSpending = budget * 0.90;
            destination = "Europe";
            if (season.equals("summer")) {
                staying = "Hotel";
            } else if (season.equals("winter")) {
                staying = "Hotel";
            }
        }
        System.out.printf("Somewhere in %s %n", destination);
        System.out.printf("%s - %.2f", staying, budgetSpending);
    }
}
