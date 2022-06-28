package MoreExercises._05_ForLoop;

import java.util.Scanner;

public class P3_Logistics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = Integer.parseInt(scanner.nextLine());

        int minibus = 0;
        int truck = 0;
        int train = 0;

        double allTons = 0;

        for (int i = 1; i <= count; i++) {
            int tons = Integer.parseInt(scanner.nextLine());

            if (tons <= 3) {
                minibus += tons;
            } else if (tons <= 11) {
                truck += tons;
            } else if (tons >= 12) {
                train += tons;
            }
            allTons += tons;
        }

        double averagePrice = ((minibus * 200) + (truck * 175) + (train * 120)) / allTons;

        System.out.printf("%.2f%n", averagePrice);
        System.out.printf("%.2f%%%n", minibus / allTons * 100);
        System.out.printf("%.2f%%%n", truck / allTons * 100);
        System.out.printf("%.2f%%%n", train / allTons * 100);
    }
}
