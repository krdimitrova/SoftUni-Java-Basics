package Lecture_05_WhileLoop._01_Lab;

import java.util.Scanner;

public class P4_Sequence2kPlus1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int m = 1;

        while (m <= n) {
            System.out.println(m);
            m = m * 2 + 1;
        }
    }
}
