package Lecture_03_ConditionalStatementsAdvanced._01_Lab;

import java.util.Scanner;

public class P5_SmallShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();
        String city = scanner.nextLine();
        double number = Double.parseDouble(scanner.nextLine());

        if (city.equals("Sofia")) {
            if (product.equals("coffee")) {
                System.out.println(0.50 * number);
            }
            if (product.equals("water")) {
                System.out.println(0.80 * number);
            }
            if (product.equals("beer")) {
                System.out.println(1.20 * number);
            }
            if (product.equals("sweets")) {
                System.out.println(1.45 * number);
            }
            if (product.equals("peanuts")) {
                System.out.println(1.60 * number);
            }
        }
        else if (city.equals("Plovdiv")) {
            if (product.equals("coffee")) {
                System.out.println(0.40 * number);
            }
            if (product.equals("water")) {
                System.out.println(0.70 * number);
            }
            if (product.equals("beer")) {
                System.out.println(1.15 * number);
            }
            if (product.equals("sweets")) {
                System.out.println(1.30 * number);
            }
            if (product.equals("peanuts")) {
                System.out.println(1.50 * number);
            }
        }

        else if (city.equals("Varna")) {
            if (product.equals("coffee")) {
                System.out.println(0.45 * number);
            }
            if (product.equals("water")) {
                System.out.println(0.70 * number);
            }
            if (product.equals("beer")) {
                System.out.println(1.10 * number);
            }
            if (product.equals("sweets")) {
                System.out.println(1.35 * number);
            }
            if (product.equals("peanuts")) {
                System.out.println(1.55 * number);
            }
        }

    }
}
