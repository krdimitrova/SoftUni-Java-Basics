package MoreExercises._02_ConditionalStatements;

import java.util.Scanner;

public class P1_PipesInPool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int v = Integer.parseInt(scanner.nextLine());
        int p1 = Integer.parseInt(scanner.nextLine());
        int p2 = Integer.parseInt(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());

        double sumP1 = p1 * h;
        double sumP2 = p2 * h;
        double totalSum = sumP1 + sumP2;
        double percents = totalSum / v * 100.0;
        double percentsP1 = sumP1 / totalSum * 100.0;
        double percentsP2 = sumP2 / totalSum * 100.0;

        if (totalSum > v) {
            System.out.printf("For %.2f hours the pool overflows with %.2f liters.", h, totalSum - v);
        } else {
            System.out.printf("The pool is %.2f%% full. Pipe 1: %.2f%%. Pipe 2: %.2f%%.", percents, percentsP1, percentsP2);

        }
    }
}
