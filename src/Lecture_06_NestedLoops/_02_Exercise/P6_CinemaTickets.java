package Lecture_06_NestedLoops._02_Exercise;

import java.util.Scanner;

public class P6_CinemaTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int totalTickets = 0;
        int kid = 0;
        int standard = 0;
        int student = 0;

        while (!input.equals("Finish")) {
            int seats = Integer.parseInt(scanner.nextLine());
            int currentTickets = 0;
            String ticket = scanner.nextLine();
            while (!ticket.equals("End")) {
                totalTickets++;
                currentTickets++;
                switch (ticket) {
                    case "student":
                        student++;
                        break;
                    case "standard":
                        standard++;
                        break;
                    case "kid":
                        kid++;
                        break;
                }
                if (currentTickets >= seats) {
                    break;
                }
                ticket = scanner.nextLine();
            }
            System.out.printf("%s - %.2f%% full.%n", input, currentTickets * 1.0 / seats * 100);
            input = scanner.nextLine();
        }
        System.out.printf("Total tickets: %d%n", totalTickets);
        System.out.printf("%.2f%% student tickets.%n", student * 1.0 / totalTickets * 100);
        System.out.printf("%.2f%% standard tickets.%n", standard * 1.0 / totalTickets * 100);
        System.out.printf("%.2f%% kids tickets.", kid * 1.0 / totalTickets * 100);
    }
}
