package MoreExercises._01_FirstStepsInCoding;

import java.util.Scanner;

public class P5_TrainingLab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double w = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());

        double length = w * 100;
        double width = h * 100;

        double widthWithoutHall = width - 100;

        double seats = Math.floor(widthWithoutHall / 70);
        double rows = Math.floor(length / 120);

        double countSeats = (seats * rows) - 3;

        System.out.printf("%.0f", countSeats);
    }
}
