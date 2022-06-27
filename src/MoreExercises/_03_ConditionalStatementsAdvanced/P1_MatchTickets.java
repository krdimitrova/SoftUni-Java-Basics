package MoreExercises._03_ConditionalStatementsAdvanced;

import java.util.Scanner;

public class P1_MatchTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String category = scanner.nextLine();
        int people = Integer.parseInt(scanner.nextLine());
        double transport = 0;
        double tickets = 0;

        if (people < 5) {
            transport = budget * 0.75;
        } else if (people < 10) {
            transport = budget * 0.60;
        } else if (people < 25) {
            transport = budget * 0.50;
        } else if (people < 50) {
            transport = budget * 0.40;
        } else if (people >= 50) {
            transport = budget * 0.25;
        }

        switch (category) {
            case "VIP":
                tickets = people * 499.99;
                break;
            case "Normal":
                tickets = people * 249.99;
        }

        double totalPrice = tickets + transport;

        if (budget >= totalPrice) {
            System.out.printf("Yes! You have %.2f leva left.", budget - totalPrice);
        } else {
            System.out.printf("Not enough money! You need %.2f leva.", totalPrice - budget);
        }
    }
}
