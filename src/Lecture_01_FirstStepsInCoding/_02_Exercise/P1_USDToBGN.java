package Lecture_01_FirstStepsInCoding._02_Exercise;

import java.util.Scanner;

public class P1_USDToBGN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double usd = Double.parseDouble(scanner.nextLine());
        double bgn = usd * 1.79549;

        System.out.println(bgn);
    }
}
