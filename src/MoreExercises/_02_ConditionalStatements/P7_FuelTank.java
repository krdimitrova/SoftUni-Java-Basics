package MoreExercises._02_ConditionalStatements;

import java.util.Scanner;

public class P7_FuelTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fuel = scanner.nextLine();
        int litres = Integer.parseInt(scanner.nextLine());

        if (fuel.equals("Diesel")) {
            if (litres >= 25) {
                System.out.printf("You have enough diesel.");
            } else {
                System.out.printf("Fill your tank with diesel!");
            }
        } else if (fuel.equals("Gasoline")) {
            if (litres >= 25) {
                System.out.printf("You have enough gasoline.");
            } else {
                System.out.printf("Fill your tank with gasoline!");
            }
        } else if (fuel.equals("Gas")) {
            if (litres >= 25) {
                System.out.printf("You have enough gas.");
            } else {
                System.out.printf("Fill your tank with gas!");
            }
        } else {
            System.out.println("Invalid fuel!");
        }
    }
}
