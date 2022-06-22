package MoreExercises._02_ConditionalStatements;

import java.util.Scanner;

public class P6_FlowerShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int magnolias = Integer.parseInt(scanner.nextLine());
        int hyacinths = Integer.parseInt(scanner.nextLine());
        int roses = Integer.parseInt(scanner.nextLine());
        int cacti = Integer.parseInt(scanner.nextLine());
        double priceForGift = Double.parseDouble(scanner.nextLine());

        double magnoliasPrice = magnolias * 3.25;
        double hyacinthsPrice = hyacinths * 4;
        double rosesPrice = roses * 3.50;
        double cactiPrice = cacti * 8;


        double totalIncome = magnoliasPrice + hyacinthsPrice + rosesPrice + cactiPrice;
        double totalMoney = totalIncome - totalIncome * 0.05;

        if (totalMoney >= priceForGift) {
            System.out.printf("She is left with %.0f leva.", Math.floor(totalMoney - priceForGift));
        } else {
            System.out.printf("She will have to borrow %.0f leva.", Math.ceil(priceForGift - totalMoney));
        }

    }
}
