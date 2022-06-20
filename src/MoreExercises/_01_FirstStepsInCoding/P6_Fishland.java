package MoreExercises._01_FirstStepsInCoding;

import java.util.Scanner;

public class P6_Fishland {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceForMackerel = Double.parseDouble(scanner.nextLine());
        double priceForSprat = Double.parseDouble(scanner.nextLine());
        double kilogramsBonito = Double.parseDouble(scanner.nextLine());
        double kilogramsScad = Double.parseDouble(scanner.nextLine());
        int kilogramsMussels = Integer.parseInt(scanner.nextLine());

        double priceForBonito = priceForMackerel + (priceForMackerel * 0.60);
        double priceForScad = priceForSprat + (priceForSprat * 0.80);
        double priceForMussels = 7.50;

        double totalPrice = (kilogramsBonito * priceForBonito) + (kilogramsScad * priceForScad) + (kilogramsMussels * priceForMussels);

        System.out.printf("%.2f", totalPrice);
    }
}
