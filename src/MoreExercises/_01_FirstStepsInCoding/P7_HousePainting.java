package MoreExercises._01_FirstStepsInCoding;

import java.util.Scanner;

public class P7_HousePainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double x = Double.parseDouble(scanner.nextLine());
        double y = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());

        double areaSideWalls = x * y;
        double window = 1.5 * 1.5;
        double sides = (2 * areaSideWalls) - (2 * window);
        double frontWall = x * x;
        double door = 1.2 * 2;
        double frontPlusBack = 2 * frontWall - door;
        double totalWallArea = (sides + frontPlusBack);
        double greenPaint = totalWallArea / 3.4;

        double sideRoof = 2 * (x * y);
        double frontRoof = 2 * ((x * h) / 2.0);
        double totalRoofArea = sideRoof + frontRoof;
        double redPaint = totalRoofArea / 4.3;

        System.out.printf("%.2f%n", greenPaint);
        System.out.printf("%.2f", redPaint);
    }
}
