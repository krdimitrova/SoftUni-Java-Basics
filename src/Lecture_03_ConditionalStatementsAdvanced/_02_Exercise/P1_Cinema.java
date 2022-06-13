package Lecture_03_ConditionalStatementsAdvanced._02_Exercise;

import java.util.Scanner;

public class P1_Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String projection = scanner.nextLine();
        int r = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());
        int totalPlaces = r * c;
        double income = 0.0;

        switch (projection) {
            case "Premiere":
                income = totalPlaces * 12.00;
                break;
            case "Normal":
                income = totalPlaces * 7.50;
                break;
            case "Discount":
                income = totalPlaces * 5.00;
                break;
        }
        System.out.printf("%.2f leva", income);
    }
}
