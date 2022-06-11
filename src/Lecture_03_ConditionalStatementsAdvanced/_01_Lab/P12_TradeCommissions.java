package Lecture_03_ConditionalStatementsAdvanced._01_Lab;

import java.util.Scanner;

public class P12_TradeCommissions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String city = scanner.nextLine();
        double sells = Double.parseDouble(scanner.nextLine());

        double tradeCom = 0.0;

        if (city.equals("Sofia")) {
            if (0 <= sells && sells <= 500) {
                tradeCom = 0.05 * sells;
                System.out.printf("%.2f",tradeCom);
            } else if (500 < sells && sells <= 1000) {
                tradeCom = 0.07 * sells;
                System.out.printf("%.2f",tradeCom);
            } else if (1000 < sells && sells <= 10000) {
                tradeCom = 0.08 * sells;
                System.out.printf("%.2f",tradeCom);
            } else if (sells > 10000) {
                tradeCom = 0.12 * sells;
                System.out.printf("%.2f",tradeCom);
            }
        } else if (city.equals("Varna")) {
            if (0 <= sells && sells <= 500) {
                tradeCom = 4.5/100 * sells;
                System.out.printf("%.2f",tradeCom);
            } else if (500 < sells && sells <= 1000) {
                tradeCom = 7.5/100 * sells;
                System.out.printf("%.2f",tradeCom);
            } else if (1000 < sells && sells <= 10000) {
                tradeCom = 0.10 * sells;
                System.out.printf("%.2f",tradeCom);
            } else if (sells > 10000) {
                tradeCom = 0.13 * sells;
                System.out.printf("%.2f",tradeCom);
            } else {
                System.out.println("error");
            }
        } else if (city.equals("Plovdiv")) {
            if (0 <= sells && sells <= 500) {
                tradeCom = 5.5/100 * sells;
                System.out.printf("%.2f",tradeCom);
            } else if (500 < sells && sells <= 1000) {
                tradeCom = 0.08 * sells;
                System.out.printf("%.2f",tradeCom);
            } else if (1000 < sells && sells <= 10000) {
                tradeCom = 0.12 * sells;
                System.out.printf("%.2f",tradeCom);
            } else if (sells > 10000) {
                tradeCom = 14.5/100 * sells;
                System.out.printf("%.2f",tradeCom);
            } else {
                System.out.println("error");
            }
        } else {
            System.out.println("error");
        }
    }
}
