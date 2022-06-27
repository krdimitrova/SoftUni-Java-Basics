package MoreExercises._03_ConditionalStatementsAdvanced;

import java.util.Scanner;

public class P6_TruckDriver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String season = scanner.nextLine();
        double km = Double.parseDouble(scanner.nextLine());
        double price = 0;

        switch (season) {
            case "Spring":
            case "Autumn":
                if (km <= 5000) {
                    price = 0.75 * km;
                } else if (km <= 10000) {
                    price = 0.95 * km;
                } else if (km <= 20000) {
                    price = 1.45 * km;
                }
                break;
            case "Summer":
                if (km <= 5000) {
                    price = 0.90 * km;
                } else if (km <= 10000) {
                    price = 1.10 * km;
                } else if (km <= 20000) {
                    price = 1.45 * km;
                }
                break;
            case "Winter":
                if (km <= 5000) {
                    price = 1.05 * km;
                } else if (km <= 10000) {
                    price = 1.25 * km;
                } else if (km <= 20000) {
                    price = 1.45 * km;
                }
                break;
        }

        price = price * 4;
        price -= price * 0.10;

        System.out.printf("%.2f", price);
    }
}
