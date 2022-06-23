package MoreExercises._03_WhileLoop;

import java.util.Scanner;

public class P1_Dishwasher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int bottles = Integer.parseInt(scanner.nextLine());
        String puts = scanner.nextLine();
        int ml = bottles * 750;
        int putIns = 1;
        int countDishes = 0;
        int countPots = 0;

        while (!puts.equals("End")) {
            int pots = Integer.parseInt(puts);

            if (/*putIns !=0 &&*/ putIns % 3 == 0) {
                ml -= pots * 15;
                countPots += pots;
            } else {
                ml -= pots * 5;
                countDishes += pots;
            }
            if (ml < 0) {
                break;
            }
            putIns++;
            puts = scanner.nextLine();
        }

        if (ml >= 0) {
            System.out.printf("Detergent was enough!%n");
            System.out.printf("%d dishes and %d pots were washed.%n", countDishes, countPots);
            System.out.printf("Leftover detergent %d ml.", ml);
        } else {
            System.out.printf("Not enough detergent, %d ml. more necessary!", Math.abs(ml));
        }
    }
}
