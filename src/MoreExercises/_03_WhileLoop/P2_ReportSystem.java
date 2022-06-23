package MoreExercises._03_WhileLoop;

import java.util.Scanner;

public class P2_ReportSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int neededSum = Integer.parseInt(scanner.nextLine());
        int cash = 0;
        int cashMoney = 0;
        int card = 0;
        int cardMoney = 0;
        int turn = 1;
        int totalMoney = 0;
        String command = scanner.nextLine();

        while (!command.equals("End")) {
            int sum = Integer.parseInt(command);

            if (turn % 2 == 0) {
                if (sum >= 10) {
                    card++;
                    cardMoney += sum;
                    System.out.printf("Product sold!%n");
                    totalMoney += sum;
                } else {
                    System.out.printf("Error in transaction!%n");
                }
            } else {
                if (sum <= 100) {
                    cash++;
                    cashMoney += sum;
                    System.out.printf("Product sold!%n");
                    totalMoney += sum;
                } else {
                    System.out.printf("Error in transaction!%n");
                }
            }

            if (totalMoney >= neededSum) {
                System.out.printf("Average CS: %.2f%n", cashMoney / (cash * 1.0));
                System.out.printf("Average CC: %.2f", cardMoney / (card * 1.0));
                break;
            }


            turn++;
            command = scanner.nextLine();
        }

        if (command.equals("End")) {
            if (totalMoney >= neededSum) {
                System.out.printf("Average CS: %.2f%n", cashMoney / (cash * 1.0));
                System.out.printf("Average CC: %.2f", cardMoney / (card * 1.0));
            } else {
                System.out.printf("Failed to collect required money for charity.%n");
            }
        }

    }
}
