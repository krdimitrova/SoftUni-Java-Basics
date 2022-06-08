package Lecture_01_FirstStepsInCoding._02_Exercise;

import java.util.Scanner;

public class P7_FoodDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int chickenMenu = Integer.parseInt(scanner.nextLine());
        int fishMenu = Integer.parseInt(scanner.nextLine());
        int vegetarianMenu = Integer.parseInt(scanner.nextLine());

        double chicken = 10.35;
        double fish = 12.40;
        double vegetarian = 8.15;

        double price = chickenMenu * chicken + fishMenu * fish + vegetarianMenu * vegetarian;
        double dessert = price * 0.20;
        double allPrice = price + dessert + 2.50;

        System.out.println(allPrice);
    }
}
