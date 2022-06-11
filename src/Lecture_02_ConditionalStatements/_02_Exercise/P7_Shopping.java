package Lecture_02_ConditionalStatements._02_Exercise;

import java.util.Scanner;

public class P7_Shopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int videoCards = Integer.parseInt(scanner.nextLine());
        int processor = Integer.parseInt(scanner.nextLine());
        int ram = Integer.parseInt(scanner.nextLine());

        double videoCardsPrice = 250 * videoCards;
        double processorPrice = videoCardsPrice * 0.35;
        double ramPrice = videoCardsPrice * 0.10;

        double totalPrice = videoCardsPrice + processor * processorPrice + ram * ramPrice;

        if (videoCards > processor) {
            totalPrice = totalPrice - totalPrice * 0.15;
        }
        if (budget >= totalPrice) {
            System.out.printf("You have %.2f leva left!", budget - totalPrice);
        } else {
            System.out.printf("Not enough money! You need %.2f leva more!", totalPrice - budget);
        }
    }
}
