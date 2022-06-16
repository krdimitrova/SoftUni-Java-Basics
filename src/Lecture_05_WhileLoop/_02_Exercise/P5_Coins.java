package Lecture_05_WhileLoop._02_Exercise;

import java.util.Scanner;

public class P5_Coins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double price = Double.parseDouble(scanner.nextLine());
        price = Math.round(price * 100);
        int coins = 0;

        while (price > 0) {
            if (price >= 200) {
                price -= 200;
                coins++;
            } else if (price >= 100) {
                price -= 100;
                coins++;
            } else if (price >= 50) {
                price -= 50;
                coins++;
            } else if (price >= 20) {
                price -= 20;
                coins++;
            } else if (price >= 10) {
                price -= 10;
                coins++;
            } else if (price >= 5) {
                price -= 5;
                coins++;
            } else if (price >= 2) {
                price -= 2;
                coins++;
            } else {
                price -= 1;
                coins++;
            }
        }
        System.out.println(coins);
    }
}
