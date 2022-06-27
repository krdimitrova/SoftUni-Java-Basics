package MoreExercises._03_ConditionalStatementsAdvanced;

import java.util.Scanner;

public class P4_CarToGo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        String typeClass = "";
        String car = "";
        double price = 0;

        if (budget <= 100) {
            typeClass = "Economy class";

            if (season.equals("Summer")) {
                car = "Cabrio";
                price = budget * 0.35;
            } else {
                car = "Jeep";
                price = budget * 0.65;
            }

        } else if (budget > 100 && budget <= 500) {
            typeClass = "Compact class";

            if (season.equals("Summer")) {
                car = "Cabrio";
                price = budget * 0.45;
            } else {
                car = "Jeep";
                price = budget * 0.80;
            }

        } else if (budget > 500) {
            typeClass = "Luxury class";

            car = "Jeep";
            price = budget * 0.90;
        }

        System.out.printf("%s%n", typeClass);
        System.out.printf("%s - %.2f", car, price);

    }
}
