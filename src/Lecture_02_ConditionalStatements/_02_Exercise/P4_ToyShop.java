package Lecture_02_ConditionalStatements._02_Exercise;

import java.util.Scanner;

public class P4_ToyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double excursionPrice = Double.parseDouble(scanner.nextLine());
        int puzzles = Integer.parseInt(scanner.nextLine());
        int speakingDolls = Integer.parseInt(scanner.nextLine());
        int teddyBears = Integer.parseInt(scanner.nextLine());
        int minions = Integer.parseInt(scanner.nextLine());
        int trucks = Integer.parseInt(scanner.nextLine());

        double totalProfit = puzzles * 2.60 + speakingDolls * 3.00 + teddyBears * 4.10 + minions * 8.20 + trucks * 2.00;
        int toysCount = puzzles + speakingDolls + teddyBears + minions + trucks;
        if (toysCount >= 50) {
            totalProfit = totalProfit - totalProfit * 0.25;
        }
        totalProfit = totalProfit - totalProfit * 0.10;

        if (totalProfit>= excursionPrice) {
            System.out.printf("Yes! %.2f lv left.", totalProfit - excursionPrice);
        } else{
            System.out.printf("Not enough money! %.2f lv needed.", excursionPrice - totalProfit);
        }
    }
}
