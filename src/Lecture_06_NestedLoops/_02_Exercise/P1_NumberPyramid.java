package Lecture_06_NestedLoops._02_Exercise;

import java.util.Scanner;

public class P1_NumberPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int count = 1;
        boolean isEnough = false;

        for (int i = 1; i <= n; i++) {
            for (int b = 1; b <= i; b++) {
                System.out.print(count + " ");
                if (count == n) {
                    isEnough = true;
                    break;
                }
                count++;
            }
            if (isEnough) {
                break;
            }
            System.out.println();
        }
    }
}
