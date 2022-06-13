package Lecture_03_ConditionalStatementsAdvanced._02_Exercise;

import java.util.Scanner;

public class P3_NewHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String flower = scanner.nextLine();
        int countFlower = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());

        double roses = 5;
        double dahlias = 3.80;
        double tulips = 2.80;
        double narcissus = 3;
        double gladiolus = 2.50;

        double priceForFlowers = 0;
        double discount = 0;
        double increase = 0;
        double priceAfterChange = 0;

        if (flower.equals("Roses")) {
            priceForFlowers = countFlower * roses;
            if (countFlower > 80) {
                discount = priceForFlowers * 0.10;
            }
            priceAfterChange = priceForFlowers - discount;
        } else if (flower.equals("Dahlias")) {
            priceForFlowers = countFlower * dahlias;
            if (countFlower > 90) {
                discount = priceForFlowers * 0.15;
            }
            priceAfterChange = priceForFlowers - discount;
        } else if (flower.equals("Tulips")) {
            priceForFlowers = countFlower * tulips;
            if (countFlower > 80) {
                discount = priceForFlowers * 0.15;
            }
            priceAfterChange = priceForFlowers - discount;
        } else if (flower.equals("Narcissus")) {
            priceForFlowers = countFlower * narcissus;
            if (countFlower < 120) {
                increase = priceForFlowers * 0.15;
            }
            priceAfterChange = priceForFlowers + increase;
        } else if (flower.equals("Gladiolus")) {
            priceForFlowers = countFlower *  gladiolus;
            if (countFlower < 80) {
                increase = priceForFlowers * 0.20;
            }
            priceAfterChange = priceForFlowers + increase;
        }


        if ( budget >= priceAfterChange) {
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", countFlower,
                    flower, budget - priceAfterChange);
        } else {
            System.out.printf("Not enough money, you need %.2f leva more.", priceAfterChange - budget);
        }
    }
}
