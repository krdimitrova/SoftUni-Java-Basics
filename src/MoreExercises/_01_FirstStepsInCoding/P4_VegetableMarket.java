package MoreExercises._01_FirstStepsInCoding;

import java.util.Scanner;

public class P4_VegetableMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceVegetables = Double.parseDouble(scanner.nextLine());
        double priceFruits = Double.parseDouble(scanner.nextLine());
        int kilogramsVeggies = Integer.parseInt(scanner.nextLine());
        int kilogramsFruits = Integer.parseInt(scanner.nextLine());

        double lv = (priceVegetables * kilogramsVeggies) + (priceFruits * kilogramsFruits);
        double euro = lv / 1.94;

        System.out.printf("%.2f", euro);
    }
}
