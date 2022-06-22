package MoreExercises._02_ConditionalStatements;

import java.util.Scanner;

public class P4_TransportPrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String transport = scanner.nextLine();
        double price = 0;
        double totalPrice = 0;

        if (n < 20) {
            if (transport.equals("day")) {
                price = 0.79 * n;
            } else {
                price = 0.90 * n;
            }
            totalPrice = 0.70 + price;
        } else if (n < 100) {
            totalPrice = n * 0.09;
        } else {
            totalPrice = n * 0.06;
        }

        System.out.printf("%.2f", totalPrice);

    }

}
