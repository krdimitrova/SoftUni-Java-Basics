package Lecture_04_ForLoop._02_Exercise;

import java.util.Scanner;

public class P7_TrekkingMania {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int groups = Integer.parseInt(scanner.nextLine());

        int musala = 0;
        int monblon = 0;
        int kilimanjaro = 0;
        int k2 = 0;
        int everest = 0;
        int sum = 0;

        for (int i = 1; i <= groups; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            if (number <= 5) {
                musala += number;
            } else if (number <= 12) {
                monblon += number;
            } else if (number <= 25) {
                kilimanjaro += number;
            } else if (number <= 40) {
                k2 += number;
            } else {
                everest += number;
            }

            sum += number;
        }

        System.out.printf("%.2f%%%n", (musala * 1.0) / sum * 100.0);
        System.out.printf("%.2f%%%n", (monblon * 1.0) / sum * 100.0);
        System.out.printf("%.2f%%%n", (kilimanjaro * 1.0) / sum * 100.0);
        System.out.printf("%.2f%%%n", (k2 * 1.0 ) / sum * 100.0);
        System.out.printf("%.2f%%%n", (everest * 1.0 ) / sum * 100.0);
    }
}
