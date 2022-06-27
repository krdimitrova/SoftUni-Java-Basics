package MoreExercises._04_WhileLoop;

import java.util.Scanner;

public class P5_AverageNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        double count = 0;

        for (int i = 1; i <= n; i++) {
            int num = Integer.parseInt(scanner.nextLine());
            sum += num;
            count++;
        }

        System.out.printf("%.2f", sum / count);

    }
}
