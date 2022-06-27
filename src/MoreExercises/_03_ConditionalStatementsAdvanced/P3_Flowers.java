package MoreExercises._03_ConditionalStatementsAdvanced;

import java.util.Scanner;

public class P3_Flowers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int chrysanthemums = Integer.parseInt(scanner.nextLine());
        int roses = Integer.parseInt(scanner.nextLine());
        int tulips = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        String holiday = scanner.nextLine();

        double chrysanthemumsPrice = 0;
        double rosesPrice = 0;
        double tulipsPrice = 0;
        double discount = 0;

        switch (season) {
            case "Spring":
            case "Summer":
                chrysanthemumsPrice = chrysanthemums * 2.00;
                rosesPrice = roses * 4.10;
                tulipsPrice = tulips * 2.50;
                break;
            case "Autumn":
            case "Winter":
                chrysanthemumsPrice = chrysanthemums * 3.75;
                rosesPrice = roses * 4.50;
                tulipsPrice = tulips * 4.15;
                break;
        }

        double price = chrysanthemumsPrice + rosesPrice + tulipsPrice;
        int bouquet = chrysanthemums + roses + tulips;

        if (holiday.equals("Y")) {
            price += price * 0.15;
        }

        if (tulips > 7 && season.equals("Spring")) {
            price -= price * 0.05;
        }
        if (roses >= 10 && season.equals("Winter")) {
            price -= price * 0.10;
        }
        if (bouquet > 20) {
            price -= price * 0.20;
        }

        price += 2;

        System.out.printf("%.2f", price);
    }
}
