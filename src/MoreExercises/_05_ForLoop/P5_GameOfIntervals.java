package MoreExercises._05_ForLoop;

import java.util.Scanner;

public class P5_GameOfIntervals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int steps = Integer.parseInt(scanner.nextLine());

        int from0to9 = 0;
        int from10to19 = 0;
        int from20to29 = 0;
        int from30to39 = 0;
        int from40to50 = 0;
        int invalid = 0;
        double total = 0;

        for (int i = 1; i <= steps; i++) {
            int num = Integer.parseInt(scanner.nextLine());

            if (num >= 0 && num <= 9) {
                from0to9++;
                total += 0.20 * num;
            } else if (num > 9 && num <= 19) {
                from10to19++;
                total += 0.30 * num;
            } else if (num > 19 && num <= 29) {
                from20to29++;
                total += 0.40 * num;
            } else if (num > 29 && num <= 39) {
                from30to39++;
                total += 50;
            } else if (num > 39 && num <= 50) {
                from40to50++;
                total += 100;
            } else {
                invalid++;
                total = total / 2;
            }

        }

        System.out.printf("%.2f%n", total);
        System.out.printf("From 0 to 9: %.2f%%%n", from0to9 * 100 / (steps * 1.0));
        System.out.printf("From 10 to 19: %.2f%%%n", from10to19 * 100 / (steps * 1.0));
        System.out.printf("From 20 to 29: %.2f%%%n", from20to29 * 100 / (steps * 1.0));
        System.out.printf("From 30 to 39: %.2f%%%n", from30to39 * 100 / (steps * 1.0));
        System.out.printf("From 40 to 50: %.2f%%%n", from40to50 * 100 / (steps * 1.0));
        System.out.printf("Invalid numbers: %.2f%%%n", invalid * 100 / (steps * 1.0));

    }
}
