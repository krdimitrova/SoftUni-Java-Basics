package Lecture_01_FirstStepsInCoding._01_Lab;

import java.util.Scanner;

public class P4_InchesToCentimeters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double inches = Double.parseDouble(scanner.nextLine());
        double cm = inches * 2.54;

        System.out.println(cm);
    }
}
