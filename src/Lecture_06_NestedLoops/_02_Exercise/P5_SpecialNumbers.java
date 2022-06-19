package Lecture_06_NestedLoops._02_Exercise;

import java.util.Scanner;

public class P5_SpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= 9; i++) {
            for (int t = 1; t <= 9; t++) {
                for (int h = 1; h <= 9; h++) {
                    for (int l = 1; l <= 9; l++) {
                        if (n % i == 0 && n % t == 0 && n % h == 0 &&n % l == 0){
                            System.out.printf("%d%d%d%d ", i, t, h, l);                        }
                    }
                }
            }
        }
    }
}
