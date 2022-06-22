package MoreExercises._02_ConditionalStatements;

import java.util.Scanner;

public class P2_SleepyTomCat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int freeDays = Integer.parseInt(scanner.nextLine());

        int playingTime = ((365 - freeDays) * 63 + (freeDays * 127));

        if (playingTime >= 30000) {
            System.out.printf("Tom will run away%n");
            System.out.printf("%d hours and %d minutes more for play", Math.abs((30000 - playingTime) / 60), Math.abs((30000 - playingTime) % 60));
        } else {
            System.out.printf("Tom sleeps well%n");
            System.out.printf("%d hours and %d minutes less for play", Math.abs((playingTime - 30000) / 60), Math.abs((playingTime - 30000) % 60));
        }
    }
}
