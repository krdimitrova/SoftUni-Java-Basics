package MoreExercises._02_ConditionalStatements;

import java.util.Scanner;

public class P3_Harvest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = Integer.parseInt(scanner.nextLine());
        double y = Double.parseDouble(scanner.nextLine());
        int z = Integer.parseInt(scanner.nextLine());
        int countWorkers = Integer.parseInt(scanner.nextLine());

        double grape = x * y;
        double wineGrape = grape * 40 / 100.0;
        double wine = wineGrape / 2.5;

        if (wine >= z) {
            System.out.printf("Good harvest this year! Total wine: %.0f liters.%n", Math.floor(wine));
            double wineLeft = Math.ceil(wine - z);
            System.out.printf("%.0f liters left -> %.0f liters per person.", wineLeft, Math.ceil(wineLeft / countWorkers * 1.0));
        } else {
            System.out.printf("It will be a tough winter! More %.0f liters wine needed.%n", Math.floor(z - wine));
        }

    }
}
