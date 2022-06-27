package MoreExercises._03_ConditionalStatementsAdvanced;

import java.util.Scanner;

public class P5_Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        String typeHotel = "";
        String location = "";
        double price = 0;

        if (budget <= 1000) {
            typeHotel = "Camp";

            if (season.equals("Summer")) {
                location = "Alaska";
                price = budget * 0.65;
            } else {
                location = "Morocco";
                price = budget * 0.45;
            }

        } else if (budget <= 3000) {
            typeHotel = "Hut";

            if (season.equals("Summer")) {
                location = "Alaska";
                price = budget * 0.80;
            } else {
                location = "Morocco";
                price = budget * 0.60;
            }

        } else if (budget > 3000) {
            typeHotel = "Hotel";

            if (season.equals("Summer")) {
                location = "Alaska";
            } else {
                location = "Morocco";
            }
            price = budget * 0.90;
        }

        System.out.printf("%s - %s - %.2f", location, typeHotel, price);

    }
}
