package Lecture_01_FirstStepsInCoding._02_Exercise;

import java.util.Scanner;

public class P2_RadiansToDegrees {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double radians = Double.parseDouble(scanner.nextLine());
        double degrees = radians * 180/Math.PI;

        System.out.println(degrees);
    }
}
