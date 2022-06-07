package Lecture_01_FirstStepsInCoding._01_Lab;

import java.util.Scanner;

public class P9_YardGreening {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double metresPerSquare = Double.parseDouble(scanner.nextLine());

        double price = metresPerSquare * 7.61;
        double discount = 0.18 * price;
        double totalPrice = price - discount;

        System.out.println("The final price is: " + totalPrice + " lv.");
        System.out.println("The discount is: " + discount + " lv.");
    }
}
