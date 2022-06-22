package MoreExercises._02_ConditionalStatements;

import java.util.Scanner;

public class P8_FuelTankPart2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fuel = scanner.nextLine();
        int litres = Integer.parseInt(scanner.nextLine());
        String card = scanner.nextLine();
        double price = 0;

        if (fuel.equals("Diesel")) {
            price = litres * 2.33;
            if (card.equals("Yes")) {
                price -= litres * 0.12;
            }
        } else if (fuel.equals("Gasoline")) {
            price = litres * 2.22;
            if (card.equals("Yes")) {
                price -= litres * 0.18;
            }
        } else if (fuel.equals("Gas")) {
            price = litres * 0.93;
            if (card.equals("Yes")) {
                price -= litres * 0.08;
            }
        }

        if (litres >= 20 && litres <= 25) {
            price -= price * 0.08;
        } else if (litres > 25) {
            price -= price * 0.10;
        }

        System.out.printf("%.2f lv.", price);
    }
}
