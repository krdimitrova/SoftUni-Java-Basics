package Lecture_02_ConditionalStatements._01_Lab;

import java.util.Scanner;

public class P7_AreaOfFigures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String figure = scanner.nextLine();

        double area = 0.0;
        if (figure.equals("square")) {
            double length = Double.parseDouble(scanner.nextLine());
            area = length * length;
        } else if (figure.equals("rectangle")) {
            double lengthA = Double.parseDouble(scanner.nextLine());
            double lengthB = Double.parseDouble(scanner.nextLine());
            area = lengthA * lengthB;
        } else if (figure.equals("circle")) {
            double r = Double.parseDouble(scanner.nextLine());
            area = Math.PI * r * r;
        } else if (figure.equals("triangle")) {
            double lengthSide = Double.parseDouble(scanner.nextLine());
            double height = Double.parseDouble(scanner.nextLine());
            area = lengthSide * height /2;
        }
        System.out.printf("%.3f", area);
    }
}
