package Lecture_01_FirstStepsInCoding._01_Lab;

import java.util.Scanner;

public class P5_GreetingByName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        System.out.println("Hello, " + name + "!");
    }
}
