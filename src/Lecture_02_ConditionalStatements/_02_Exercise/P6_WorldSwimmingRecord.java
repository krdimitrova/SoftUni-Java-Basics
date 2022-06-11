package Lecture_02_ConditionalStatements._02_Exercise;

import java.util.Scanner;

public class P6_WorldSwimmingRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double record = Double.parseDouble(scanner.nextLine());
        double metres = Double.parseDouble(scanner.nextLine());
        double seconds = Double.parseDouble(scanner.nextLine());

        double totalSeconds = seconds * metres;
        double times = Math.floor(metres / 15.0);
        double totalTime = times * 12.5;
        double score = totalSeconds + totalTime;


        if (score < record) {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", score);
        } else {
            System.out.printf("No, he failed! He was %.2f seconds slower.", Math.abs(score - record) );
        }
    }
}
