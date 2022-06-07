package Lecture_01_FirstStepsInCoding._01_Lab;

import java.util.Scanner;

public class P8_PetShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dogFood = Integer.parseInt(scanner.nextLine());
        int catFood = Integer.parseInt(scanner.nextLine());

        double priceForDogFood =  2.50;
        double priceForCatFood =  4;
        double totalPrice = dogFood * priceForDogFood + catFood * priceForCatFood;

        System.out.printf("%.2f lv.", totalPrice);
    }
}
