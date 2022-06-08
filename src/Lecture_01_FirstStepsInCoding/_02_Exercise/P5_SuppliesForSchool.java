package Lecture_01_FirstStepsInCoding._02_Exercise;

import java.util.Scanner;

public class P5_SuppliesForSchool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int penPackets = Integer.parseInt(scanner.nextLine());
        int markerPackets = Integer.parseInt(scanner.nextLine());
        int boardCleaner = Integer.parseInt(scanner.nextLine());
        int discount = Integer.parseInt(scanner.nextLine());

        double totalWithoutDiscount = penPackets * 5.80 + markerPackets * 7.20 + boardCleaner* 1.20;
        double totalSum = totalWithoutDiscount - (discount * 1.0/100) * totalWithoutDiscount;

        System.out.println(totalSum);
    }
}
