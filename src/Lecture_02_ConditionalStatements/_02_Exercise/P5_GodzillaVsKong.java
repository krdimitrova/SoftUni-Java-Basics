package Lecture_02_ConditionalStatements._02_Exercise;

import java.util.Scanner;

public class P5_GodzillaVsKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int statists = Integer.parseInt(scanner.nextLine());
        double priceForOutfit = Double.parseDouble(scanner.nextLine());

        double totalPriceForOutfit = priceForOutfit * statists;
        double decoration = budget * 0.10;
        double totalPrice = totalPriceForOutfit + decoration;


        if (statists > 150) {
            totalPriceForOutfit = totalPriceForOutfit - totalPriceForOutfit * 0.10;
            totalPrice = totalPriceForOutfit + decoration;
        } else if (statists <= 150) {
            totalPriceForOutfit = totalPriceForOutfit;
            totalPrice = totalPriceForOutfit + decoration;
        }
        if (totalPrice <= budget) {
            System.out.printf("Action! %n Wingard starts filming with %.2f leva left.", budget - totalPrice);
        } else {
            System.out.printf("Not enough money! %n Wingard needs %.2f leva more.", totalPrice - budget);
        }
    }
}
