package Lecture_01_FirstStepsInCoding._02_Exercise;

import java.util.Scanner;

public class P8_BasketballEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int annualFee = Integer.parseInt(scanner.nextLine());
        double sneakers = annualFee - annualFee * 0.4;
        double outfit = sneakers - sneakers * 0.20;
        double ball = outfit / 4;
        double accessories = ball / 5;
        double totalSum = annualFee + sneakers + outfit + ball + accessories;

        System.out.println(totalSum);
    }
}
