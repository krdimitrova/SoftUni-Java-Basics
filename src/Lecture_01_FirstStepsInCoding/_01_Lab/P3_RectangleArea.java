package Lecture_01_FirstStepsInCoding._01_Lab;

import java.util.Scanner;

public class P3_RectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());

        int area = a * b;

        System.out.println(area);
    }
}
