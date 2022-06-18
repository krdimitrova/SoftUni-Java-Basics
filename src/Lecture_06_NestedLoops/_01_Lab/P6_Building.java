package Lecture_06_NestedLoops._01_Lab;

import java.util.Scanner;

public class P6_Building {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int floors = Integer.parseInt(scanner.nextLine());
        int rooms = Integer.parseInt(scanner.nextLine());

        for (int floor = floors; floor >= 1; floor --) {

            for (int roomNumber = 0; roomNumber <= rooms - 1; roomNumber++) {
                if (floor == floors) {
                    System.out.print("L" + floor + roomNumber + " ");
                } else if (floor % 2 == 0) {
                    System.out.print("O" + floor + roomNumber + " ");
                } else {
                    System.out.print("A" + floor + roomNumber + " ");
                }
            }
            System.out.println();
        }
    }
}
